package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.DeviceRunInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public interface DeviceRunInfoMapper {
    //查找所有的设备信息
    @Select("select * from DeviceRunInfo")
    @ResultType(DeviceRunInfo.class)
    List<DeviceRunInfo> findAll();
    //根据ID查询信息
    @Select("select * from DeviceRunInfo where id=#{id}")
    DeviceRunInfo findOneById(@Param("id") int id);
    @Delete("delete from DeviceRunInfo where id=#{id}")
    //删除某一个设备信息
    int deleteOneById(@Param("id") int id);
    //添加设备运行信息
    @Insert("insert into DeviceRunInfo(sjhqsj, runstatus,rundays,fueltype,\n" +
            "mediatype,glsw_state,sxsw_state,glyl_state,pattern_number,fdkg,\n" +
            "btpywd,pywd,lswd,ckwd,jnqckwd,jnqrkwd,gswd,ltwd,\n" +
            "ltckwd,lbwd,rlwd,lfwd,fyzqwd,grzqwd,hlwd_first,hlwd_second,hlwd_third,\n" +
            "hlwd_forth,hlwd_fifth,swwd,zqyl,gsyl,ckyl,rkyl,ltyl,\n" +
            "ltckyl,rqyl,ycfy,ecfy,rll,zqll,gsll,xhll,bsll,glyw,sxyw,\n" +
            "pyyhl,lpsdfk,yfscfk,gfscfk,gsscfk,mswd,xxwd,pzgyw,szgyw,lnygyw,\n" +
            "cgyw,pzgwd,szgwd,cgwd,glyl,grzqyl,pycyl,fsfy,yfjdl,gfjdl,\n" +
            "gljsdfk,pgwd_first,pgwd_second,pgwd_third,pgwd_forth,pgwd_fifth,\n" +
            "pgwd_sixth,pgwd_seventh,pgwd_eighth,pgwd_ninth,pgwd_tenth,paiyanwd,\n" +
            "bjwd,tlwd,mbwd,qlwd,zhhc,qlhc,qys,hys,qcs,hcs,lbbjwd,\n" +
            "ltckbjwd,bhwd,btpywdbjz,jrzs,houyanshi,sdwd,mklts,gfhys,yfhys,sxkbwd,lsbjwd,bcxs,\n" +
            "cankaowd,tlzdz,qlzxz,ckhc,tlwd_first,qowd_first,tlwd_second,qlwd_second,dhcgwd,lstlwd,lsqlwd,\n" +
            "msbjwd,mstlwd,msqlwd,kbyl,gbyl,pgbjwd,hlbjwd_first,hlkbwd_first,\n" +
            "hlgbwd_first,hlbjwd_second,hlkbwd_second,hlgbwd_second,hlbjwd_third,hlkbwd_third,\n" +
            "hlgbwd_third,hlbjwd_forth,hlkbwd_forth,hlgbwd_forth,hlbjwd_fifth,hlkbwd_fifth,\n" +
            "hlgbwd_fifth,tzsj_first,tzsj_second,tzsj_third,tzsj_forth,tzsj_fifth,\n" +
            "tzsj_sixth,rsq,jrz,bsb,gsb,byb,xhb,lnb,rsb,zkb,ecxhb,\n" +
            "yfb,gfj,lp,czj,ecgfj,dhq,smj,slj,jyb,pwb,hlxhb_first,\n" +
            "hlxhb_second,hlxhb_third,hlxhb_forth,hlxhb_fifth,deviceno,jcylsj,\n" +
            "yslsj,dhsj,slqdsj,sltzsj,dhjg,qdsj_first,qdsj_second,qdsj_third,qdsj_forth,qdsj_fifth,qdsj_sixth) " +
            "values (#{sjhqsj},#{runstatus},#{rundays},#{fueltype},\n" +
            "#{mediatype},#{glsw_state},#{sxsw_state},#{glyl_state},#{pattern_number},#{fdkg},\n" +
            "#{btpywd},#{pywd},#{lswd},#{ckwd},#{jnqckwd},#{jnqrkwd},#{gswd},#{ltwd},\n" +
            "#{ltckwd},#{lbwd},#{rlwd},#{lfwd},#{fyzqwd},#{grzqwd},#{hlwd_first},#{hlwd_second},#{hlwd_third},\n" +
            "#{hlwd_forth},#{hlwd_fifth},#{swwd},#{zqyl},#{gsyl},#{ckyl},#{rkyl},#{ltyl},\n" +
            "#{ltckyl},#{rqyl},#{ycfy},#{ecfy},#{rll},#{zqll},#{gsll},#{xhll},#{bsll},#{glyw},#{sxyw},\n" +
            "#{pyyhl},#{lpsdfk},#{yfscfk},#{gfscfk},#{gsscfk},#{mswd},#{xxwd},#{pzgyw},#{szgyw},#{lnygyw},\n" +
            "#{cgyw},#{pzgwd},#{szgwd},#{cgwd},#{glyl},#{grzqyl},#{pycyl},#{fsfy},#{yfjdl},#{gfjdl},\n" +
            "#{gljsdfk},#{pgwd_first},#{pgwd_second},#{pgwd_third},#{pgwd_forth},#{pgwd_fifth},\n" +
            "#{pgwd_sixth},#{pgwd_seventh},#{pgwd_eighth},#{pgwd_ninth},#{pgwd_tenth},#{paiyanwd},\n" +
            "#{bjwd},#{tlwd},#{mbwd},#{qlwd},#{zhhc},#{qlhc},#{qys},#{hys},#{qcs},#{hcs},#{lbbjwd},\n" +
            "#{ltckbjwd},#{bhwd},#{btpywdbjz},#{jrzs},#{houyanshi},#{sdwd},#{mklts},#{gfhys},#{yfhys},#{sxkbwd},#{lsbjwd},#{bcxs},\n" +
            "#{cankaowd},#{tlzdz},#{qlzxz},#{ckhc},#{tlwd_first},#{qowd_first},#{tlwd_second},#{qlwd_second},#{dhcgwd},#{lstlwd},#{lsqlwd},\n" +
            "#{msbjwd},#{mstlwd},#{msqlwd},#{kbyl},#{gbyl},#{pgbjwd},#{hlbjwd_first},#{hlkbwd_first},\n" +
            "#{hlgbwd_first},#{hlbjwd_second},#{hlkbwd_second},#{hlgbwd_second},#{hlbjwd_third},#{hlkbwd_third},\n" +
            "#{hlgbwd_third},#{hlbjwd_forth},#{hlkbwd_forth},#{hlgbwd_forth},#{hlbjwd_fifth},#{hlkbwd_fifth},\n" +
            "#{hlgbwd_fifth},#{tzsj_first},#{tzsj_second},#{tzsj_third},#{tzsj_forth},#{tzsj_fifth},\n" +
            "#{tzsj_sixth},#{rsq},#{jrz},#{bsb},#{gsb},#{byb},#{xhb},#{lnb},#{rsb},#{zkb},#{ecxhb},\n" +
            "#{yfb},#{gfj},#{lp},#{czj},#{ecgfj},#{dhq},#{smj},#{slj},#{jyb},#{pwb},#{hlxhb_first},\n" +
            "#{hlxhb_second},#{hlxhb_third},#{hlxhb_forth},#{hlxhb_fifth},#{deviceno},#{jcylsj},\n" +
            "#{yslsj},#{dhsj},#{slqdsj},#{sltzsj},#{dhjg},#{qdsj_first},#{qdsj_second},#{qdsj_third},#{qdsj_forth},#{qdsj_fifth},#{qdsj_sixth}" +
            ")")
    int addDeviceRunInfo(DeviceRunInfo deviceRunInfo);




    //获取某台设备近十小时的压力数据
    @Select("select ")
    List<Integer> getPressDate(String deviceNo);

}
