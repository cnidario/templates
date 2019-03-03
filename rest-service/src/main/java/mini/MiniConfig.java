package mini;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("mini.data.mapper")
public class MiniConfig {
}
