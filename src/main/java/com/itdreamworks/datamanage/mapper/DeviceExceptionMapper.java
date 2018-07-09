package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.DeviceException;
import com.itdreamworks.datamanage.entity.DeviceRunInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface DeviceExceptionMapper {
    //获取所有的异常信息
    @Select("select * from DeviceException")
    @ResultType(DeviceRunInfo.class)
    List<DeviceException> findAll();
    //添加设备运行异常信息（报警）
    @Insert("insert into DeviceException(deviceNo,pattern_Number,alarm_PYWDG,alarm_LSWDG,alarm_CKWDG,alarm_CY,alarm_JXDSW,alarm_DSW,\n" +
            "alarm_GSW,alarm_SWXHLJC,alarm_LBWDG,alarm_FYZQWDG,alarm_RSQGZ,alarm_RQXL,alarm_RQYLD,alarm_RQYLYC,\n" +
            "alarm_RQYLG,alarm_GSBPGZ,alarm_XHBPQGZ,alarm_YFBPQGZ,alarm_GFBPQGZ,alarm_ECGFBPQGZ,alarm_LPBPQGZ,\n" +
            "alarm_GSBGZ,alarm_XHBGZ,alarm_QianYa,alarm_DDY,alarm_GDY,alarm_QueYou,alarm_LD,bSQGYBH,exception_GJCS,\n" +
            "exception_SDCS,failure_SZ,failure_CCQ,alarm_WBLS,alarm_QY,alarm_DYW,alarm_BTPYWDG,alarm_BPQGZ,alarm_MSWDG,\n" +
            "failure_GL_First,failure_GL_Second,failure_GL_Third,failure_GL_Forth,failure_GL_Fifth,failure_GL_Sixth,\n" +
            "failure_GL_Seventh,failure_GL_Eighth,alarm_BSBPQ,alarm_SLKGBHBJ,alarm_RKWDD,failure_XHBBPQ,failure_ECXHBBPQ,\n" +
            "failure_RSBBPQ,failure_BYBBPQ,failure_ECGFBPQ,failure_SLJBPQ,failure_ZKBBPQ,failure_LNBBPQ,failure_BSB,\n" +
            "failure_BYB,failure_LNB,failure_RSB,failure_ZKB,failure_ECXHB,failure_HL_First,failure_HL_Second,failure_HL_Third,\n" +
            "failure_HL_Forth,failure_HL_Fifth,failure_HLWDG_First,failure_HLWDG_Second,failure_HLWDG_Third,failure_HLWDG_Forth,\n" +
            "failure_HLWDG_Fifth,failure_HLWDG_Sixth,failure_PGWDG_Second,failure_PGWDG_Third,failure_PGWDG_Forth,failure_PGWDG_Fifth,\n" +
            "failure_PGWDG_Sixth,failure_PGWDG_Seventh,failure_PGWDG_Eighth,failure_PGWDG_Ninth,failure_PGWDG_Tenth,alarm_SZGCY,alarm_LNGCY,\n" +
            "alarm_PZGCY,alarm_SZGYWG,alarm_SZGYWD,alarm_LNGYWG,alarm_LNGYWD,alarm_PZGYWG,alarm_PZGYWD,alarm_JCKYCD,alarm_JCKYCG,alarm_ZKYLBZ,\n" +
            "alarm_JCKWCD,alarm_JCKWCG,alarm_CKYLG,alarm_CKYLD,alarm_RKYLG,alarm_RKYLD,alarm_YFJGZ,failure_BTPYWDCGQ,failure_PYWDCGQ,failure_LSWDCGQ,\n" +
            "failure_CKWDCGQ,failure_RKWDCGQ,failure_JNQCKWDCGQ,failure_JNQRKWDCGQ,failure_GSWDCGQ,failure_LTWDCGQ,failure_LTCKWDCGQ,failure_LBWDCGQ,\n" +
            "failure_RLWDCGQ,failure_RFWDCGQ,failure_FYZQWDCGQ,failure_GRZQWDCGQ,failure_HLWDCGQ_First,failure_HLWDCGQ_Second,failure_HLWDCGQ_Third,\n" +
            "failure_HLWDCGQ_Forth,failure_HLWDCGQ_Fifth,failure_SWWDCGQ,failure_ZQYLCGQ,failure_GSYLCGQ,failure_CKYLCGQ,failure_RKYLCGQ,failure_LTYLCGQ,\n" +
            "failure_LTCKYLCGQ,failure_RQYLCGQ,failure_YCFYCGQ,failure_ECFYCGQ,failure_RMLCGQ,failure_ZQLLCGQ,failure_XHLLCGQ,failure_GSLLCGQ,failure_BSLLCGQ,\n" +
            "failure_GLYWCGQ,failure_SXYWCGQ,failure_PYYHLCGQ,failure_LPSDFKCGQ,failure_YFSCFKCGQ,failure_GFSCFKCGQ,failure_GSSCFKCGQ,failure_MSWDCGQ,failure_SXWDCGQ,\n" +
            "failure_PZGYWCGQ,failure_SZGYWCGQ,failure_LNYGYWCGQ,failure_CGYWCGQ,failure_PZGWDCGQ,failure_SZGWDCGQ,failure_LNYGWDCGQ,failure_CGWDCGQ,failure_GLYLCGQ,\n" +
            "failure_GRZQYLCGQ,failure_PYCYLCGQ,failure_FSFYCGQ,failure_YFJDLCGQ,failure_GFJDLCGQ,failure_GLJSDFKCGQ,failure_PGWDCGQ_First,failure_PGWDCGQ_Second,\n" +
            "failure_PGWDCGQ_Third,failure_PGWDCGQ_Forth,failure_PGWDCGQ_Fifth,failure_PGWDCGQ_Sixth,\n" +
            "failure_PGWDCGQ_Seventh,failure_PGWDCGQ_Eighth,failure_PGWDCGQ_Ninth,failure_PGWDCGQ_Tenth) values(#{deviceNo},#{pattern_Number},#{alarm_PYWDG},#{alarm_LSWDG},#{alarm_CKWDG},#{alarm_CY},#{alarm_JXDSW},#{alarm_DSW},#{\n" +
            "alarm_GSW},#{alarm_SWXHLJC},#{alarm_LBWDG},#{alarm_FYZQWDG},#{alarm_RSQGZ},#{alarm_RQXL},#{alarm_RQYLD},#{alarm_RQYLYC},#{\n" +
            "alarm_RQYLG},#{alarm_GSBPGZ},#{alarm_XHBPQGZ},#{alarm_YFBPQGZ},#{alarm_GFBPQGZ},#{alarm_ECGFBPQGZ},#{alarm_LPBPQGZ},#{\n" +
            "alarm_GSBGZ},#{alarm_XHBGZ},#{alarm_QianYa},#{alarm_DDY},#{alarm_GDY},#{alarm_QueYou},#{alarm_LD},#{bSQGYBH},#{exception_GJCS},#{\n" +
            "exception_SDCS},#{failure_SZ},#{failure_CCQ},#{alarm_WBLS},#{alarm_QY},#{alarm_DYW},#{alarm_BTPYWDG},#{alarm_BPQGZ},#{alarm_MSWDG},#{\n" +
            "failure_GL_First},#{failure_GL_Second},#{failure_GL_Third},#{failure_GL_Forth},#{failure_GL_Fifth},#{failure_GL_Sixth},#{\n" +
            "failure_GL_Seventh},#{failure_GL_Eighth},#{alarm_BSBPQ},#{alarm_SLKGBHBJ},#{alarm_RKWDD},#{failure_XHBBPQ},#{failure_ECXHBBPQ},#{\n" +
            "failure_RSBBPQ},#{failure_BYBBPQ},#{failure_ECGFBPQ},#{failure_SLJBPQ},#{failure_ZKBBPQ},#{failure_LNBBPQ},#{failure_BSB},#{\n" +
            "failure_BYB},#{failure_LNB},#{failure_RSB},#{failure_ZKB},#{failure_ECXHB},#{failure_HL_First},#{failure_HL_Second},#{failure_HL_Third},#{\n" +
            "failure_HL_Forth},#{failure_HL_Fifth},#{failure_HLWDG_First},#{failure_HLWDG_Second},#{failure_HLWDG_Third},#{failure_HLWDG_Forth},#{\n" +
            "failure_HLWDG_Fifth},#{failure_HLWDG_Sixth},#{failure_PGWDG_Second},#{failure_PGWDG_Third},#{failure_PGWDG_Forth},#{failure_PGWDG_Fifth},#{\n" +
            "failure_PGWDG_Sixth},#{failure_PGWDG_Seventh},#{failure_PGWDG_Eighth},#{failure_PGWDG_Ninth},#{failure_PGWDG_Tenth},#{alarm_SZGCY},#{alarm_LNGCY},#{\n" +
            "alarm_PZGCY},#{alarm_SZGYWG},#{alarm_SZGYWD},#{alarm_LNGYWG},#{alarm_LNGYWD},#{alarm_PZGYWG},#{alarm_PZGYWD},#{alarm_JCKYCD},#{alarm_JCKYCG},#{alarm_ZKYLBZ},#{\n" +
            "alarm_JCKWCD},#{alarm_JCKWCG},#{alarm_CKYLG},#{alarm_CKYLD},#{alarm_RKYLG},#{alarm_RKYLD},#{alarm_YFJGZ},#{failure_BTPYWDCGQ},#{failure_PYWDCGQ},#{failure_LSWDCGQ},#{\n" +
            "failure_CKWDCGQ},#{failure_RKWDCGQ},#{failure_JNQCKWDCGQ},#{failure_JNQRKWDCGQ},#{failure_GSWDCGQ},#{failure_LTWDCGQ},#{failure_LTCKWDCGQ},#{failure_LBWDCGQ},#{\n" +
            "failure_RLWDCGQ},#{failure_RFWDCGQ},#{failure_FYZQWDCGQ},#{failure_GRZQWDCGQ},#{failure_HLWDCGQ_First},#{failure_HLWDCGQ_Second},#{failure_HLWDCGQ_Third},#{\n" +
            "failure_HLWDCGQ_Forth},#{failure_HLWDCGQ_Fifth},#{failure_SWWDCGQ},#{failure_ZQYLCGQ},#{failure_GSYLCGQ},#{failure_CKYLCGQ},#{failure_RKYLCGQ},#{failure_LTYLCGQ},#{\n" +
            "failure_LTCKYLCGQ},#{failure_RQYLCGQ},#{failure_YCFYCGQ},#{failure_ECFYCGQ},#{failure_RMLCGQ},#{failure_ZQLLCGQ},#{failure_XHLLCGQ},#{failure_GSLLCGQ},#{failure_BSLLCGQ},#{\n" +
            "failure_GLYWCGQ},#{failure_SXYWCGQ},#{failure_PYYHLCGQ},#{failure_LPSDFKCGQ},#{failure_YFSCFKCGQ},#{failure_GFSCFKCGQ},#{failure_GSSCFKCGQ},#{failure_MSWDCGQ},#{failure_SXWDCGQ},#{\n" +
            "failure_PZGYWCGQ},#{failure_SZGYWCGQ},#{failure_LNYGYWCGQ},#{failure_CGYWCGQ},#{failure_PZGWDCGQ},#{failure_SZGWDCGQ},#{failure_LNYGWDCGQ},#{failure_CGWDCGQ},#{failure_GLYLCGQ},#{\n" +
            "failure_GRZQYLCGQ},#{failure_PYCYLCGQ},#{failure_FSFYCGQ},#{failure_YFJDLCGQ},#{failure_GFJDLCGQ},#{failure_GLJSDFKCGQ},#{failure_PGWDCGQ_First},#{failure_PGWDCGQ_Second},#{\n" +
            "failure_PGWDCGQ_Third},#{failure_PGWDCGQ_Forth},#{failure_PGWDCGQ_Fifth},#{failure_PGWDCGQ_Sixth},#{\n" +
            "failure_PGWDCGQ_Seventh},#{failure_PGWDCGQ_Eighth},#{failure_PGWDCGQ_Ninth},#{failure_PGWDCGQ_Tenth})")
    int addDeviceException(DeviceException deviceException);

}
