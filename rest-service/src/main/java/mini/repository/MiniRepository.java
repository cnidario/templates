package mini.repository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mini.data.mapper.MiniMapper;
import mini.model.Mini;

@Repository
public class MiniRepository {
	@Autowired
	private MiniMapper miniMapper;
	
	public Optional<Mini> findMiniById(Integer miniId) {
		return Optional.ofNullable(miniMapper.getMiniById(miniId));
	}
}
