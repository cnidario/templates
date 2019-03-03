package mini.controller;

import org.springframework.web.bind.annotation.RestController;

import mini.controller.exception.MiniNotFoundException;
import mini.model.Mini;
import mini.repository.MiniRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiniRestController {
	@Autowired
	private MiniRepository miniRepository;

    @RequestMapping("/mini/{id}")
    public String mini(@PathVariable("id") Integer id) {
    	Optional<Mini> mini = miniRepository.findMiniById(id);
        if(mini.isPresent()) {
        	return mini.get().getName();
        } else {
        	throw new MiniNotFoundException();
        }
    }

}