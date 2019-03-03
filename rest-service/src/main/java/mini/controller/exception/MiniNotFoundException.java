package mini.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Mini no encontrado")
public class MiniNotFoundException extends RuntimeException {
}
