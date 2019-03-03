package mini.data.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import mini.model.Mini;

@Mapper
public interface MiniMapper {
	@Insert("insert into mini(name) values (#{name})")
	public Integer save(Mini mini);
	
	@Select("select id, name from mini where id = #{miniId}")
	@Results(value = {
			@Result(property = "id", column = "id"),
			@Result(property = "name", column = "name")
	})
	public Mini getMiniById(Integer miniId);
}
