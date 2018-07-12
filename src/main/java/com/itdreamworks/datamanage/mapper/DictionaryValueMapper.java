package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.DictionaryValue;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface DictionaryValueMapper {

    @Select("select Type,Label,Value,Sort from dictionary_value")
    List<DictionaryValue> getDictionaryValueList();

    @Select("select Label,Value,Sort from dictionary_value where type = #{type}")
    List<DictionaryValue> getDictionaryValueListByType(String type);
}
