package com.jd.lvsheng.maven_test;

import org.apache.ibatis.annotations.Select;

public interface ClientMapper {

	@Select("SELECT * FROM client_file WHERE id = #{id}")
	ClientFile selectClient(int id);
}
