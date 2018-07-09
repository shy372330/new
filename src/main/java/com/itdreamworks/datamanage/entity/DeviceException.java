package com.itdreamworks.datamanage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DeviceException {
     private Integer pattern_Number,alarm_PYWDG,alarm_LSWDG,alarm_CKWDG,alarm_CY,alarm_JXDSW,alarm_DSW,
          alarm_GSW,alarm_SWXHLJC,alarm_LBWDG,alarm_FYZQWDG,alarm_RSQGZ,alarm_RQXL,alarm_RQYLD,alarm_RQYLYC,
          alarm_RQYLG,alarm_GSBPGZ,alarm_XHBPQGZ,alarm_YFBPQGZ,alarm_GFBPQGZ,alarm_ECGFBPQGZ,alarm_LPBPQGZ,
          alarm_GSBGZ,alarm_XHBGZ,alarm_QianYa,alarm_DDY,alarm_GDY,alarm_QueYou,alarm_LD,bSQGYBH,exception_GJCS,
          exception_SDCS,failure_SZ,failure_CCQ,alarm_WBLS,alarm_QY,alarm_DYW,alarm_BTPYWDG,alarm_BPQGZ,alarm_MSWDG,
          failure_GL_First,failure_GL_Second,failure_GL_Third,failure_GL_Forth,failure_GL_Fifth,failure_GL_Sixth,
          failure_GL_Seventh,failure_GL_Eighth,alarm_BSBPQ,alarm_SLKGBHBJ,alarm_RKWDD,failure_XHBBPQ,failure_ECXHBBPQ,
          failure_RSBBPQ,failure_BYBBPQ,failure_ECGFBPQ,failure_SLJBPQ,failure_ZKBBPQ,failure_LNBBPQ,failure_BSB,
          failure_BYB,failure_LNB,failure_RSB,failure_ZKB,failure_ECXHB,failure_HL_First,failure_HL_Second,failure_HL_Third,
          failure_HL_Forth,failure_HL_Fifth,failure_HLWDG_First,failure_HLWDG_Second,failure_HLWDG_Third,failure_HLWDG_Forth,
          failure_HLWDG_Fifth,failure_HLWDG_Sixth,failure_PGWDG_Second,failure_PGWDG_Third,failure_PGWDG_Forth,failure_PGWDG_Fifth,
          failure_PGWDG_Sixth,failure_PGWDG_Seventh,failure_PGWDG_Eighth,failure_PGWDG_Ninth,failure_PGWDG_Tenth,alarm_SZGCY,alarm_LNGCY,
          alarm_PZGCY,alarm_SZGYWG,alarm_SZGYWD,alarm_LNGYWG,alarm_LNGYWD,alarm_PZGYWG,alarm_PZGYWD,alarm_JCKYCD,alarm_JCKYCG,alarm_ZKYLBZ,
          alarm_JCKWCD,alarm_JCKWCG,alarm_CKYLG,alarm_CKYLD,alarm_RKYLG,alarm_RKYLD,alarm_YFJGZ,failure_BTPYWDCGQ,failure_PYWDCGQ,failure_LSWDCGQ,
          failure_CKWDCGQ,failure_RKWDCGQ,failure_JNQCKWDCGQ,failure_JNQRKWDCGQ,failure_GSWDCGQ,failure_LTWDCGQ,failure_LTCKWDCGQ,failure_LBWDCGQ,
          failure_RLWDCGQ,failure_RFWDCGQ,failure_FYZQWDCGQ,failure_GRZQWDCGQ,failure_HLWDCGQ_First,failure_HLWDCGQ_Second,failure_HLWDCGQ_Third,
          failure_HLWDCGQ_Forth,failure_HLWDCGQ_Fifth,failure_SWWDCGQ,failure_ZQYLCGQ,failure_GSYLCGQ,failure_CKYLCGQ,failure_RKYLCGQ,failure_LTYLCGQ,
          failure_LTCKYLCGQ,failure_RQYLCGQ,failure_YCFYCGQ,failure_ECFYCGQ,failure_RMLCGQ,failure_ZQLLCGQ,failure_XHLLCGQ,failure_GSLLCGQ,failure_BSLLCGQ,
          failure_GLYWCGQ,failure_SXYWCGQ,failure_PYYHLCGQ,failure_LPSDFKCGQ,failure_YFSCFKCGQ,failure_GFSCFKCGQ,failure_GSSCFKCGQ,failure_MSWDCGQ,failure_SXWDCGQ,
          failure_PZGYWCGQ,failure_SZGYWCGQ,failure_LNYGYWCGQ,failure_CGYWCGQ,failure_PZGWDCGQ,failure_SZGWDCGQ,failure_LNYGWDCGQ,failure_CGWDCGQ,failure_GLYLCGQ,
          failure_GRZQYLCGQ,failure_PYCYLCGQ,failure_FSFYCGQ,failure_YFJDLCGQ,failure_GFJDLCGQ,failure_GLJSDFKCGQ,failure_PGWDCGQ_First,failure_PGWDCGQ_Second,
          failure_PGWDCGQ_Third,failure_PGWDCGQ_Forth,failure_PGWDCGQ_Fifth,failure_PGWDCGQ_Sixth,
          failure_PGWDCGQ_Seventh,failure_PGWDCGQ_Eighth,failure_PGWDCGQ_Ninth,failure_PGWDCGQ_Tenth;
    private String deviceNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
     private Date yCHQSJ;

    public Integer getPattern_Number() {
        return pattern_Number;
    }

    public void setPattern_Number(Integer pattern_Number) {
        this.pattern_Number = pattern_Number;
    }

    public Integer getAlarm_PYWDG() {
        return alarm_PYWDG;
    }

    public void setAlarm_PYWDG(Integer alarm_PYWDG) {
        this.alarm_PYWDG = alarm_PYWDG;
    }

    public Integer getAlarm_LSWDG() {
        return alarm_LSWDG;
    }

    public void setAlarm_LSWDG(Integer alarm_LSWDG) {
        this.alarm_LSWDG = alarm_LSWDG;
    }

    public Integer getAlarm_CKWDG() {
        return alarm_CKWDG;
    }

    public void setAlarm_CKWDG(Integer alarm_CKWDG) {
        this.alarm_CKWDG = alarm_CKWDG;
    }

    public Integer getAlarm_CY() {
        return alarm_CY;
    }

    public void setAlarm_CY(Integer alarm_CY) {
        this.alarm_CY = alarm_CY;
    }

    public Integer getAlarm_JXDSW() {
        return alarm_JXDSW;
    }

    public void setAlarm_JXDSW(Integer alarm_JXDSW) {
        this.alarm_JXDSW = alarm_JXDSW;
    }

    public Integer getAlarm_DSW() {
        return alarm_DSW;
    }

    public void setAlarm_DSW(Integer alarm_DSW) {
        this.alarm_DSW = alarm_DSW;
    }

    public Integer getAlarm_GSW() {
        return alarm_GSW;
    }

    public void setAlarm_GSW(Integer alarm_GSW) {
        this.alarm_GSW = alarm_GSW;
    }

    public Integer getAlarm_SWXHLJC() {
        return alarm_SWXHLJC;
    }

    public void setAlarm_SWXHLJC(Integer alarm_SWXHLJC) {
        this.alarm_SWXHLJC = alarm_SWXHLJC;
    }

    public Integer getAlarm_LBWDG() {
        return alarm_LBWDG;
    }

    public void setAlarm_LBWDG(Integer alarm_LBWDG) {
        this.alarm_LBWDG = alarm_LBWDG;
    }

    public Integer getAlarm_FYZQWDG() {
        return alarm_FYZQWDG;
    }

    public void setAlarm_FYZQWDG(Integer alarm_FYZQWDG) {
        this.alarm_FYZQWDG = alarm_FYZQWDG;
    }

    public Integer getAlarm_RSQGZ() {
        return alarm_RSQGZ;
    }

    public void setAlarm_RSQGZ(Integer alarm_RSQGZ) {
        this.alarm_RSQGZ = alarm_RSQGZ;
    }

    public Integer getAlarm_RQXL() {
        return alarm_RQXL;
    }

    public void setAlarm_RQXL(Integer alarm_RQXL) {
        this.alarm_RQXL = alarm_RQXL;
    }

    public Integer getAlarm_RQYLD() {
        return alarm_RQYLD;
    }

    public void setAlarm_RQYLD(Integer alarm_RQYLD) {
        this.alarm_RQYLD = alarm_RQYLD;
    }

    public Integer getAlarm_RQYLYC() {
        return alarm_RQYLYC;
    }

    public void setAlarm_RQYLYC(Integer alarm_RQYLYC) {
        this.alarm_RQYLYC = alarm_RQYLYC;
    }

    public Integer getAlarm_RQYLG() {
        return alarm_RQYLG;
    }

    public void setAlarm_RQYLG(Integer alarm_RQYLG) {
        this.alarm_RQYLG = alarm_RQYLG;
    }

    public Integer getAlarm_GSBPGZ() {
        return alarm_GSBPGZ;
    }

    public void setAlarm_GSBPGZ(Integer alarm_GSBPGZ) {
        this.alarm_GSBPGZ = alarm_GSBPGZ;
    }

    public Integer getAlarm_XHBPQGZ() {
        return alarm_XHBPQGZ;
    }

    public void setAlarm_XHBPQGZ(Integer alarm_XHBPQGZ) {
        this.alarm_XHBPQGZ = alarm_XHBPQGZ;
    }

    public Integer getAlarm_YFBPQGZ() {
        return alarm_YFBPQGZ;
    }

    public void setAlarm_YFBPQGZ(Integer alarm_YFBPQGZ) {
        this.alarm_YFBPQGZ = alarm_YFBPQGZ;
    }

    public Integer getAlarm_GFBPQGZ() {
        return alarm_GFBPQGZ;
    }

    public void setAlarm_GFBPQGZ(Integer alarm_GFBPQGZ) {
        this.alarm_GFBPQGZ = alarm_GFBPQGZ;
    }

    public Integer getAlarm_ECGFBPQGZ() {
        return alarm_ECGFBPQGZ;
    }

    public void setAlarm_ECGFBPQGZ(Integer alarm_ECGFBPQGZ) {
        this.alarm_ECGFBPQGZ = alarm_ECGFBPQGZ;
    }

    public Integer getAlarm_LPBPQGZ() {
        return alarm_LPBPQGZ;
    }

    public void setAlarm_LPBPQGZ(Integer alarm_LPBPQGZ) {
        this.alarm_LPBPQGZ = alarm_LPBPQGZ;
    }

    public Integer getAlarm_GSBGZ() {
        return alarm_GSBGZ;
    }

    public void setAlarm_GSBGZ(Integer alarm_GSBGZ) {
        this.alarm_GSBGZ = alarm_GSBGZ;
    }

    public Integer getAlarm_XHBGZ() {
        return alarm_XHBGZ;
    }

    public void setAlarm_XHBGZ(Integer alarm_XHBGZ) {
        this.alarm_XHBGZ = alarm_XHBGZ;
    }

    public Integer getAlarm_QianYa() {
        return alarm_QianYa;
    }

    public void setAlarm_QianYa(Integer alarm_QianYa) {
        this.alarm_QianYa = alarm_QianYa;
    }

    public Integer getAlarm_DDY() {
        return alarm_DDY;
    }

    public void setAlarm_DDY(Integer alarm_DDY) {
        this.alarm_DDY = alarm_DDY;
    }

    public Integer getAlarm_GDY() {
        return alarm_GDY;
    }

    public void setAlarm_GDY(Integer alarm_GDY) {
        this.alarm_GDY = alarm_GDY;
    }

    public Integer getAlarm_QueYou() {
        return alarm_QueYou;
    }

    public void setAlarm_QueYou(Integer alarm_QueYou) {
        this.alarm_QueYou = alarm_QueYou;
    }

    public Integer getAlarm_LD() {
        return alarm_LD;
    }

    public void setAlarm_LD(Integer alarm_LD) {
        this.alarm_LD = alarm_LD;
    }

    public Integer getbSQGYBH() {
        return bSQGYBH;
    }

    public void setbSQGYBH(Integer bSQGYBH) {
        this.bSQGYBH = bSQGYBH;
    }

    public Integer getException_GJCS() {
        return exception_GJCS;
    }

    public void setException_GJCS(Integer exception_GJCS) {
        this.exception_GJCS = exception_GJCS;
    }

    public Integer getException_SDCS() {
        return exception_SDCS;
    }

    public void setException_SDCS(Integer exception_SDCS) {
        this.exception_SDCS = exception_SDCS;
    }

    public Integer getFailure_SZ() {
        return failure_SZ;
    }

    public void setFailure_SZ(Integer failure_SZ) {
        this.failure_SZ = failure_SZ;
    }

    public Integer getFailure_CCQ() {
        return failure_CCQ;
    }

    public void setFailure_CCQ(Integer failure_CCQ) {
        this.failure_CCQ = failure_CCQ;
    }

    public Integer getAlarm_WBLS() {
        return alarm_WBLS;
    }

    public void setAlarm_WBLS(Integer alarm_WBLS) {
        this.alarm_WBLS = alarm_WBLS;
    }

    public Integer getAlarm_QY() {
        return alarm_QY;
    }

    public void setAlarm_QY(Integer alarm_QY) {
        this.alarm_QY = alarm_QY;
    }

    public Integer getAlarm_DYW() {
        return alarm_DYW;
    }

    public void setAlarm_DYW(Integer alarm_DYW) {
        this.alarm_DYW = alarm_DYW;
    }

    public Integer getAlarm_BTPYWDG() {
        return alarm_BTPYWDG;
    }

    public void setAlarm_BTPYWDG(Integer alarm_BTPYWDG) {
        this.alarm_BTPYWDG = alarm_BTPYWDG;
    }

    public Integer getAlarm_BPQGZ() {
        return alarm_BPQGZ;
    }

    public void setAlarm_BPQGZ(Integer alarm_BPQGZ) {
        this.alarm_BPQGZ = alarm_BPQGZ;
    }

    public Integer getAlarm_MSWDG() {
        return alarm_MSWDG;
    }

    public void setAlarm_MSWDG(Integer alarm_MSWDG) {
        this.alarm_MSWDG = alarm_MSWDG;
    }

    public Integer getFailure_GL_First() {
        return failure_GL_First;
    }

    public void setFailure_GL_First(Integer failure_GL_First) {
        this.failure_GL_First = failure_GL_First;
    }

    public Integer getFailure_GL_Second() {
        return failure_GL_Second;
    }

    public void setFailure_GL_Second(Integer failure_GL_Second) {
        this.failure_GL_Second = failure_GL_Second;
    }

    public Integer getFailure_GL_Third() {
        return failure_GL_Third;
    }

    public void setFailure_GL_Third(Integer failure_GL_Third) {
        this.failure_GL_Third = failure_GL_Third;
    }

    public Integer getFailure_GL_Forth() {
        return failure_GL_Forth;
    }

    public void setFailure_GL_Forth(Integer failure_GL_Forth) {
        this.failure_GL_Forth = failure_GL_Forth;
    }

    public Integer getFailure_GL_Fifth() {
        return failure_GL_Fifth;
    }

    public void setFailure_GL_Fifth(Integer failure_GL_Fifth) {
        this.failure_GL_Fifth = failure_GL_Fifth;
    }

    public Integer getFailure_GL_Sixth() {
        return failure_GL_Sixth;
    }

    public void setFailure_GL_Sixth(Integer failure_GL_Sixth) {
        this.failure_GL_Sixth = failure_GL_Sixth;
    }

    public Integer getFailure_GL_Seventh() {
        return failure_GL_Seventh;
    }

    public void setFailure_GL_Seventh(Integer failure_GL_Seventh) {
        this.failure_GL_Seventh = failure_GL_Seventh;
    }

    public Integer getFailure_GL_Eighth() {
        return failure_GL_Eighth;
    }

    public void setFailure_GL_Eighth(Integer failure_GL_Eighth) {
        this.failure_GL_Eighth = failure_GL_Eighth;
    }

    public Integer getAlarm_BSBPQ() {
        return alarm_BSBPQ;
    }

    public void setAlarm_BSBPQ(Integer alarm_BSBPQ) {
        this.alarm_BSBPQ = alarm_BSBPQ;
    }

    public Integer getAlarm_SLKGBHBJ() {
        return alarm_SLKGBHBJ;
    }

    public void setAlarm_SLKGBHBJ(Integer alarm_SLKGBHBJ) {
        this.alarm_SLKGBHBJ = alarm_SLKGBHBJ;
    }

    public Integer getAlarm_RKWDD() {
        return alarm_RKWDD;
    }

    public void setAlarm_RKWDD(Integer alarm_RKWDD) {
        this.alarm_RKWDD = alarm_RKWDD;
    }

    public Integer getFailure_XHBBPQ() {
        return failure_XHBBPQ;
    }

    public void setFailure_XHBBPQ(Integer failure_XHBBPQ) {
        this.failure_XHBBPQ = failure_XHBBPQ;
    }

    public Integer getFailure_ECXHBBPQ() {
        return failure_ECXHBBPQ;
    }

    public void setFailure_ECXHBBPQ(Integer failure_ECXHBBPQ) {
        this.failure_ECXHBBPQ = failure_ECXHBBPQ;
    }

    public Integer getFailure_RSBBPQ() {
        return failure_RSBBPQ;
    }

    public void setFailure_RSBBPQ(Integer failure_RSBBPQ) {
        this.failure_RSBBPQ = failure_RSBBPQ;
    }

    public Integer getFailure_BYBBPQ() {
        return failure_BYBBPQ;
    }

    public void setFailure_BYBBPQ(Integer failure_BYBBPQ) {
        this.failure_BYBBPQ = failure_BYBBPQ;
    }

    public Integer getFailure_ECGFBPQ() {
        return failure_ECGFBPQ;
    }

    public void setFailure_ECGFBPQ(Integer failure_ECGFBPQ) {
        this.failure_ECGFBPQ = failure_ECGFBPQ;
    }

    public Integer getFailure_SLJBPQ() {
        return failure_SLJBPQ;
    }

    public void setFailure_SLJBPQ(Integer failure_SLJBPQ) {
        this.failure_SLJBPQ = failure_SLJBPQ;
    }

    public Integer getFailure_ZKBBPQ() {
        return failure_ZKBBPQ;
    }

    public void setFailure_ZKBBPQ(Integer failure_ZKBBPQ) {
        this.failure_ZKBBPQ = failure_ZKBBPQ;
    }

    public Integer getFailure_LNBBPQ() {
        return failure_LNBBPQ;
    }

    public void setFailure_LNBBPQ(Integer failure_LNBBPQ) {
        this.failure_LNBBPQ = failure_LNBBPQ;
    }

    public Integer getFailure_BSB() {
        return failure_BSB;
    }

    public void setFailure_BSB(Integer failure_BSB) {
        this.failure_BSB = failure_BSB;
    }

    public Integer getFailure_BYB() {
        return failure_BYB;
    }

    public void setFailure_BYB(Integer failure_BYB) {
        this.failure_BYB = failure_BYB;
    }

    public Integer getFailure_LNB() {
        return failure_LNB;
    }

    public void setFailure_LNB(Integer failure_LNB) {
        this.failure_LNB = failure_LNB;
    }

    public Integer getFailure_RSB() {
        return failure_RSB;
    }

    public void setFailure_RSB(Integer failure_RSB) {
        this.failure_RSB = failure_RSB;
    }

    public Integer getFailure_ZKB() {
        return failure_ZKB;
    }

    public void setFailure_ZKB(Integer failure_ZKB) {
        this.failure_ZKB = failure_ZKB;
    }

    public Integer getFailure_ECXHB() {
        return failure_ECXHB;
    }

    public void setFailure_ECXHB(Integer failure_ECXHB) {
        this.failure_ECXHB = failure_ECXHB;
    }

    public Integer getFailure_HL_First() {
        return failure_HL_First;
    }

    public void setFailure_HL_First(Integer failure_HL_First) {
        this.failure_HL_First = failure_HL_First;
    }

    public Integer getFailure_HL_Second() {
        return failure_HL_Second;
    }

    public void setFailure_HL_Second(Integer failure_HL_Second) {
        this.failure_HL_Second = failure_HL_Second;
    }

    public Integer getFailure_HL_Third() {
        return failure_HL_Third;
    }

    public void setFailure_HL_Third(Integer failure_HL_Third) {
        this.failure_HL_Third = failure_HL_Third;
    }

    public Integer getFailure_HL_Forth() {
        return failure_HL_Forth;
    }

    public void setFailure_HL_Forth(Integer failure_HL_Forth) {
        this.failure_HL_Forth = failure_HL_Forth;
    }

    public Integer getFailure_HL_Fifth() {
        return failure_HL_Fifth;
    }

    public void setFailure_HL_Fifth(Integer failure_HL_Fifth) {
        this.failure_HL_Fifth = failure_HL_Fifth;
    }

    public Integer getFailure_HLWDG_First() {
        return failure_HLWDG_First;
    }

    public void setFailure_HLWDG_First(Integer failure_HLWDG_First) {
        this.failure_HLWDG_First = failure_HLWDG_First;
    }

    public Integer getFailure_HLWDG_Second() {
        return failure_HLWDG_Second;
    }

    public void setFailure_HLWDG_Second(Integer failure_HLWDG_Second) {
        this.failure_HLWDG_Second = failure_HLWDG_Second;
    }

    public Integer getFailure_HLWDG_Third() {
        return failure_HLWDG_Third;
    }

    public void setFailure_HLWDG_Third(Integer failure_HLWDG_Third) {
        this.failure_HLWDG_Third = failure_HLWDG_Third;
    }

    public Integer getFailure_HLWDG_Forth() {
        return failure_HLWDG_Forth;
    }

    public void setFailure_HLWDG_Forth(Integer failure_HLWDG_Forth) {
        this.failure_HLWDG_Forth = failure_HLWDG_Forth;
    }

    public Integer getFailure_HLWDG_Fifth() {
        return failure_HLWDG_Fifth;
    }

    public void setFailure_HLWDG_Fifth(Integer failure_HLWDG_Fifth) {
        this.failure_HLWDG_Fifth = failure_HLWDG_Fifth;
    }

    public Integer getFailure_HLWDG_Sixth() {
        return failure_HLWDG_Sixth;
    }

    public void setFailure_HLWDG_Sixth(Integer failure_HLWDG_Sixth) {
        this.failure_HLWDG_Sixth = failure_HLWDG_Sixth;
    }

    public Integer getFailure_PGWDG_Second() {
        return failure_PGWDG_Second;
    }

    public void setFailure_PGWDG_Second(Integer failure_PGWDG_Second) {
        this.failure_PGWDG_Second = failure_PGWDG_Second;
    }

    public Integer getFailure_PGWDG_Third() {
        return failure_PGWDG_Third;
    }

    public void setFailure_PGWDG_Third(Integer failure_PGWDG_Third) {
        this.failure_PGWDG_Third = failure_PGWDG_Third;
    }

    public Integer getFailure_PGWDG_Forth() {
        return failure_PGWDG_Forth;
    }

    public void setFailure_PGWDG_Forth(Integer failure_PGWDG_Forth) {
        this.failure_PGWDG_Forth = failure_PGWDG_Forth;
    }

    public Integer getFailure_PGWDG_Fifth() {
        return failure_PGWDG_Fifth;
    }

    public void setFailure_PGWDG_Fifth(Integer failure_PGWDG_Fifth) {
        this.failure_PGWDG_Fifth = failure_PGWDG_Fifth;
    }

    public Integer getFailure_PGWDG_Sixth() {
        return failure_PGWDG_Sixth;
    }

    public void setFailure_PGWDG_Sixth(Integer failure_PGWDG_Sixth) {
        this.failure_PGWDG_Sixth = failure_PGWDG_Sixth;
    }

    public Integer getFailure_PGWDG_Seventh() {
        return failure_PGWDG_Seventh;
    }

    public void setFailure_PGWDG_Seventh(Integer failure_PGWDG_Seventh) {
        this.failure_PGWDG_Seventh = failure_PGWDG_Seventh;
    }

    public Integer getFailure_PGWDG_Eighth() {
        return failure_PGWDG_Eighth;
    }

    public void setFailure_PGWDG_Eighth(Integer failure_PGWDG_Eighth) {
        this.failure_PGWDG_Eighth = failure_PGWDG_Eighth;
    }

    public Integer getFailure_PGWDG_Ninth() {
        return failure_PGWDG_Ninth;
    }

    public void setFailure_PGWDG_Ninth(Integer failure_PGWDG_Ninth) {
        this.failure_PGWDG_Ninth = failure_PGWDG_Ninth;
    }

    public Integer getFailure_PGWDG_Tenth() {
        return failure_PGWDG_Tenth;
    }

    public void setFailure_PGWDG_Tenth(Integer failure_PGWDG_Tenth) {
        this.failure_PGWDG_Tenth = failure_PGWDG_Tenth;
    }

    public Integer getAlarm_SZGCY() {
        return alarm_SZGCY;
    }

    public void setAlarm_SZGCY(Integer alarm_SZGCY) {
        this.alarm_SZGCY = alarm_SZGCY;
    }

    public Integer getAlarm_LNGCY() {
        return alarm_LNGCY;
    }

    public void setAlarm_LNGCY(Integer alarm_LNGCY) {
        this.alarm_LNGCY = alarm_LNGCY;
    }

    public Integer getAlarm_PZGCY() {
        return alarm_PZGCY;
    }

    public void setAlarm_PZGCY(Integer alarm_PZGCY) {
        this.alarm_PZGCY = alarm_PZGCY;
    }

    public Integer getAlarm_SZGYWG() {
        return alarm_SZGYWG;
    }

    public void setAlarm_SZGYWG(Integer alarm_SZGYWG) {
        this.alarm_SZGYWG = alarm_SZGYWG;
    }

    public Integer getAlarm_SZGYWD() {
        return alarm_SZGYWD;
    }

    public void setAlarm_SZGYWD(Integer alarm_SZGYWD) {
        this.alarm_SZGYWD = alarm_SZGYWD;
    }

    public Integer getAlarm_LNGYWG() {
        return alarm_LNGYWG;
    }

    public void setAlarm_LNGYWG(Integer alarm_LNGYWG) {
        this.alarm_LNGYWG = alarm_LNGYWG;
    }

    public Integer getAlarm_LNGYWD() {
        return alarm_LNGYWD;
    }

    public void setAlarm_LNGYWD(Integer alarm_LNGYWD) {
        this.alarm_LNGYWD = alarm_LNGYWD;
    }

    public Integer getAlarm_PZGYWG() {
        return alarm_PZGYWG;
    }

    public void setAlarm_PZGYWG(Integer alarm_PZGYWG) {
        this.alarm_PZGYWG = alarm_PZGYWG;
    }

    public Integer getAlarm_PZGYWD() {
        return alarm_PZGYWD;
    }

    public void setAlarm_PZGYWD(Integer alarm_PZGYWD) {
        this.alarm_PZGYWD = alarm_PZGYWD;
    }

    public Integer getAlarm_JCKYCD() {
        return alarm_JCKYCD;
    }

    public void setAlarm_JCKYCD(Integer alarm_JCKYCD) {
        this.alarm_JCKYCD = alarm_JCKYCD;
    }

    public Integer getAlarm_JCKYCG() {
        return alarm_JCKYCG;
    }

    public void setAlarm_JCKYCG(Integer alarm_JCKYCG) {
        this.alarm_JCKYCG = alarm_JCKYCG;
    }

    public Integer getAlarm_ZKYLBZ() {
        return alarm_ZKYLBZ;
    }

    public void setAlarm_ZKYLBZ(Integer alarm_ZKYLBZ) {
        this.alarm_ZKYLBZ = alarm_ZKYLBZ;
    }

    public Integer getAlarm_JCKWCD() {
        return alarm_JCKWCD;
    }

    public void setAlarm_JCKWCD(Integer alarm_JCKWCD) {
        this.alarm_JCKWCD = alarm_JCKWCD;
    }

    public Integer getAlarm_JCKWCG() {
        return alarm_JCKWCG;
    }

    public void setAlarm_JCKWCG(Integer alarm_JCKWCG) {
        this.alarm_JCKWCG = alarm_JCKWCG;
    }

    public Integer getAlarm_CKYLG() {
        return alarm_CKYLG;
    }

    public void setAlarm_CKYLG(Integer alarm_CKYLG) {
        this.alarm_CKYLG = alarm_CKYLG;
    }

    public Integer getAlarm_CKYLD() {
        return alarm_CKYLD;
    }

    public void setAlarm_CKYLD(Integer alarm_CKYLD) {
        this.alarm_CKYLD = alarm_CKYLD;
    }

    public Integer getAlarm_RKYLG() {
        return alarm_RKYLG;
    }

    public void setAlarm_RKYLG(Integer alarm_RKYLG) {
        this.alarm_RKYLG = alarm_RKYLG;
    }

    public Integer getAlarm_RKYLD() {
        return alarm_RKYLD;
    }

    public void setAlarm_RKYLD(Integer alarm_RKYLD) {
        this.alarm_RKYLD = alarm_RKYLD;
    }

    public Integer getAlarm_YFJGZ() {
        return alarm_YFJGZ;
    }

    public void setAlarm_YFJGZ(Integer alarm_YFJGZ) {
        this.alarm_YFJGZ = alarm_YFJGZ;
    }

    public Integer getFailure_BTPYWDCGQ() {
        return failure_BTPYWDCGQ;
    }

    public void setFailure_BTPYWDCGQ(Integer failure_BTPYWDCGQ) {
        this.failure_BTPYWDCGQ = failure_BTPYWDCGQ;
    }

    public Integer getFailure_PYWDCGQ() {
        return failure_PYWDCGQ;
    }

    public void setFailure_PYWDCGQ(Integer failure_PYWDCGQ) {
        this.failure_PYWDCGQ = failure_PYWDCGQ;
    }

    public Integer getFailure_LSWDCGQ() {
        return failure_LSWDCGQ;
    }

    public void setFailure_LSWDCGQ(Integer failure_LSWDCGQ) {
        this.failure_LSWDCGQ = failure_LSWDCGQ;
    }

    public Integer getFailure_CKWDCGQ() {
        return failure_CKWDCGQ;
    }

    public void setFailure_CKWDCGQ(Integer failure_CKWDCGQ) {
        this.failure_CKWDCGQ = failure_CKWDCGQ;
    }

    public Integer getFailure_RKWDCGQ() {
        return failure_RKWDCGQ;
    }

    public void setFailure_RKWDCGQ(Integer failure_RKWDCGQ) {
        this.failure_RKWDCGQ = failure_RKWDCGQ;
    }

    public Integer getFailure_JNQCKWDCGQ() {
        return failure_JNQCKWDCGQ;
    }

    public void setFailure_JNQCKWDCGQ(Integer failure_JNQCKWDCGQ) {
        this.failure_JNQCKWDCGQ = failure_JNQCKWDCGQ;
    }

    public Integer getFailure_JNQRKWDCGQ() {
        return failure_JNQRKWDCGQ;
    }

    public void setFailure_JNQRKWDCGQ(Integer failure_JNQRKWDCGQ) {
        this.failure_JNQRKWDCGQ = failure_JNQRKWDCGQ;
    }

    public Integer getFailure_GSWDCGQ() {
        return failure_GSWDCGQ;
    }

    public void setFailure_GSWDCGQ(Integer failure_GSWDCGQ) {
        this.failure_GSWDCGQ = failure_GSWDCGQ;
    }

    public Integer getFailure_LTWDCGQ() {
        return failure_LTWDCGQ;
    }

    public void setFailure_LTWDCGQ(Integer failure_LTWDCGQ) {
        this.failure_LTWDCGQ = failure_LTWDCGQ;
    }

    public Integer getFailure_LTCKWDCGQ() {
        return failure_LTCKWDCGQ;
    }

    public void setFailure_LTCKWDCGQ(Integer failure_LTCKWDCGQ) {
        this.failure_LTCKWDCGQ = failure_LTCKWDCGQ;
    }

    public Integer getFailure_LBWDCGQ() {
        return failure_LBWDCGQ;
    }

    public void setFailure_LBWDCGQ(Integer failure_LBWDCGQ) {
        this.failure_LBWDCGQ = failure_LBWDCGQ;
    }

    public Integer getFailure_RLWDCGQ() {
        return failure_RLWDCGQ;
    }

    public void setFailure_RLWDCGQ(Integer failure_RLWDCGQ) {
        this.failure_RLWDCGQ = failure_RLWDCGQ;
    }

    public Integer getFailure_RFWDCGQ() {
        return failure_RFWDCGQ;
    }

    public void setFailure_RFWDCGQ(Integer failure_RFWDCGQ) {
        this.failure_RFWDCGQ = failure_RFWDCGQ;
    }

    public Integer getFailure_FYZQWDCGQ() {
        return failure_FYZQWDCGQ;
    }

    public void setFailure_FYZQWDCGQ(Integer failure_FYZQWDCGQ) {
        this.failure_FYZQWDCGQ = failure_FYZQWDCGQ;
    }

    public Integer getFailure_GRZQWDCGQ() {
        return failure_GRZQWDCGQ;
    }

    public void setFailure_GRZQWDCGQ(Integer failure_GRZQWDCGQ) {
        this.failure_GRZQWDCGQ = failure_GRZQWDCGQ;
    }

    public Integer getFailure_HLWDCGQ_First() {
        return failure_HLWDCGQ_First;
    }

    public void setFailure_HLWDCGQ_First(Integer failure_HLWDCGQ_First) {
        this.failure_HLWDCGQ_First = failure_HLWDCGQ_First;
    }

    public Integer getFailure_HLWDCGQ_Second() {
        return failure_HLWDCGQ_Second;
    }

    public void setFailure_HLWDCGQ_Second(Integer failure_HLWDCGQ_Second) {
        this.failure_HLWDCGQ_Second = failure_HLWDCGQ_Second;
    }

    public Integer getFailure_HLWDCGQ_Third() {
        return failure_HLWDCGQ_Third;
    }

    public void setFailure_HLWDCGQ_Third(Integer failure_HLWDCGQ_Third) {
        this.failure_HLWDCGQ_Third = failure_HLWDCGQ_Third;
    }

    public Integer getFailure_HLWDCGQ_Forth() {
        return failure_HLWDCGQ_Forth;
    }

    public void setFailure_HLWDCGQ_Forth(Integer failure_HLWDCGQ_Forth) {
        this.failure_HLWDCGQ_Forth = failure_HLWDCGQ_Forth;
    }

    public Integer getFailure_HLWDCGQ_Fifth() {
        return failure_HLWDCGQ_Fifth;
    }

    public void setFailure_HLWDCGQ_Fifth(Integer failure_HLWDCGQ_Fifth) {
        this.failure_HLWDCGQ_Fifth = failure_HLWDCGQ_Fifth;
    }

    public Integer getFailure_SWWDCGQ() {
        return failure_SWWDCGQ;
    }

    public void setFailure_SWWDCGQ(Integer failure_SWWDCGQ) {
        this.failure_SWWDCGQ = failure_SWWDCGQ;
    }

    public Integer getFailure_ZQYLCGQ() {
        return failure_ZQYLCGQ;
    }

    public void setFailure_ZQYLCGQ(Integer failure_ZQYLCGQ) {
        this.failure_ZQYLCGQ = failure_ZQYLCGQ;
    }

    public Integer getFailure_GSYLCGQ() {
        return failure_GSYLCGQ;
    }

    public void setFailure_GSYLCGQ(Integer failure_GSYLCGQ) {
        this.failure_GSYLCGQ = failure_GSYLCGQ;
    }

    public Integer getFailure_CKYLCGQ() {
        return failure_CKYLCGQ;
    }

    public void setFailure_CKYLCGQ(Integer failure_CKYLCGQ) {
        this.failure_CKYLCGQ = failure_CKYLCGQ;
    }

    public Integer getFailure_RKYLCGQ() {
        return failure_RKYLCGQ;
    }

    public void setFailure_RKYLCGQ(Integer failure_RKYLCGQ) {
        this.failure_RKYLCGQ = failure_RKYLCGQ;
    }

    public Integer getFailure_LTYLCGQ() {
        return failure_LTYLCGQ;
    }

    public void setFailure_LTYLCGQ(Integer failure_LTYLCGQ) {
        this.failure_LTYLCGQ = failure_LTYLCGQ;
    }

    public Integer getFailure_LTCKYLCGQ() {
        return failure_LTCKYLCGQ;
    }

    public void setFailure_LTCKYLCGQ(Integer failure_LTCKYLCGQ) {
        this.failure_LTCKYLCGQ = failure_LTCKYLCGQ;
    }

    public Integer getFailure_RQYLCGQ() {
        return failure_RQYLCGQ;
    }

    public void setFailure_RQYLCGQ(Integer failure_RQYLCGQ) {
        this.failure_RQYLCGQ = failure_RQYLCGQ;
    }

    public Integer getFailure_YCFYCGQ() {
        return failure_YCFYCGQ;
    }

    public void setFailure_YCFYCGQ(Integer failure_YCFYCGQ) {
        this.failure_YCFYCGQ = failure_YCFYCGQ;
    }

    public Integer getFailure_ECFYCGQ() {
        return failure_ECFYCGQ;
    }

    public void setFailure_ECFYCGQ(Integer failure_ECFYCGQ) {
        this.failure_ECFYCGQ = failure_ECFYCGQ;
    }

    public Integer getFailure_RMLCGQ() {
        return failure_RMLCGQ;
    }

    public void setFailure_RMLCGQ(Integer failure_RMLCGQ) {
        this.failure_RMLCGQ = failure_RMLCGQ;
    }

    public Integer getFailure_ZQLLCGQ() {
        return failure_ZQLLCGQ;
    }

    public void setFailure_ZQLLCGQ(Integer failure_ZQLLCGQ) {
        this.failure_ZQLLCGQ = failure_ZQLLCGQ;
    }

    public Integer getFailure_XHLLCGQ() {
        return failure_XHLLCGQ;
    }

    public void setFailure_XHLLCGQ(Integer failure_XHLLCGQ) {
        this.failure_XHLLCGQ = failure_XHLLCGQ;
    }

    public Integer getFailure_GSLLCGQ() {
        return failure_GSLLCGQ;
    }

    public void setFailure_GSLLCGQ(Integer failure_GSLLCGQ) {
        this.failure_GSLLCGQ = failure_GSLLCGQ;
    }

    public Integer getFailure_BSLLCGQ() {
        return failure_BSLLCGQ;
    }

    public void setFailure_BSLLCGQ(Integer failure_BSLLCGQ) {
        this.failure_BSLLCGQ = failure_BSLLCGQ;
    }

    public Integer getFailure_GLYWCGQ() {
        return failure_GLYWCGQ;
    }

    public void setFailure_GLYWCGQ(Integer failure_GLYWCGQ) {
        this.failure_GLYWCGQ = failure_GLYWCGQ;
    }

    public Integer getFailure_SXYWCGQ() {
        return failure_SXYWCGQ;
    }

    public void setFailure_SXYWCGQ(Integer failure_SXYWCGQ) {
        this.failure_SXYWCGQ = failure_SXYWCGQ;
    }

    public Integer getFailure_PYYHLCGQ() {
        return failure_PYYHLCGQ;
    }

    public void setFailure_PYYHLCGQ(Integer failure_PYYHLCGQ) {
        this.failure_PYYHLCGQ = failure_PYYHLCGQ;
    }

    public Integer getFailure_LPSDFKCGQ() {
        return failure_LPSDFKCGQ;
    }

    public void setFailure_LPSDFKCGQ(Integer failure_LPSDFKCGQ) {
        this.failure_LPSDFKCGQ = failure_LPSDFKCGQ;
    }

    public Integer getFailure_YFSCFKCGQ() {
        return failure_YFSCFKCGQ;
    }

    public void setFailure_YFSCFKCGQ(Integer failure_YFSCFKCGQ) {
        this.failure_YFSCFKCGQ = failure_YFSCFKCGQ;
    }

    public Integer getFailure_GFSCFKCGQ() {
        return failure_GFSCFKCGQ;
    }

    public void setFailure_GFSCFKCGQ(Integer failure_GFSCFKCGQ) {
        this.failure_GFSCFKCGQ = failure_GFSCFKCGQ;
    }

    public Integer getFailure_GSSCFKCGQ() {
        return failure_GSSCFKCGQ;
    }

    public void setFailure_GSSCFKCGQ(Integer failure_GSSCFKCGQ) {
        this.failure_GSSCFKCGQ = failure_GSSCFKCGQ;
    }

    public Integer getFailure_MSWDCGQ() {
        return failure_MSWDCGQ;
    }

    public void setFailure_MSWDCGQ(Integer failure_MSWDCGQ) {
        this.failure_MSWDCGQ = failure_MSWDCGQ;
    }

    public Integer getFailure_SXWDCGQ() {
        return failure_SXWDCGQ;
    }

    public void setFailure_SXWDCGQ(Integer failure_SXWDCGQ) {
        this.failure_SXWDCGQ = failure_SXWDCGQ;
    }

    public Integer getFailure_PZGYWCGQ() {
        return failure_PZGYWCGQ;
    }

    public void setFailure_PZGYWCGQ(Integer failure_PZGYWCGQ) {
        this.failure_PZGYWCGQ = failure_PZGYWCGQ;
    }

    public Integer getFailure_SZGYWCGQ() {
        return failure_SZGYWCGQ;
    }

    public void setFailure_SZGYWCGQ(Integer failure_SZGYWCGQ) {
        this.failure_SZGYWCGQ = failure_SZGYWCGQ;
    }

    public Integer getFailure_LNYGYWCGQ() {
        return failure_LNYGYWCGQ;
    }

    public void setFailure_LNYGYWCGQ(Integer failure_LNYGYWCGQ) {
        this.failure_LNYGYWCGQ = failure_LNYGYWCGQ;
    }

    public Integer getFailure_CGYWCGQ() {
        return failure_CGYWCGQ;
    }

    public void setFailure_CGYWCGQ(Integer failure_CGYWCGQ) {
        this.failure_CGYWCGQ = failure_CGYWCGQ;
    }

    public Integer getFailure_PZGWDCGQ() {
        return failure_PZGWDCGQ;
    }

    public void setFailure_PZGWDCGQ(Integer failure_PZGWDCGQ) {
        this.failure_PZGWDCGQ = failure_PZGWDCGQ;
    }

    public Integer getFailure_SZGWDCGQ() {
        return failure_SZGWDCGQ;
    }

    public void setFailure_SZGWDCGQ(Integer failure_SZGWDCGQ) {
        this.failure_SZGWDCGQ = failure_SZGWDCGQ;
    }

    public Integer getFailure_LNYGWDCGQ() {
        return failure_LNYGWDCGQ;
    }

    public void setFailure_LNYGWDCGQ(Integer failure_LNYGWDCGQ) {
        this.failure_LNYGWDCGQ = failure_LNYGWDCGQ;
    }

    public Integer getFailure_CGWDCGQ() {
        return failure_CGWDCGQ;
    }

    public void setFailure_CGWDCGQ(Integer failure_CGWDCGQ) {
        this.failure_CGWDCGQ = failure_CGWDCGQ;
    }

    public Integer getFailure_GLYLCGQ() {
        return failure_GLYLCGQ;
    }

    public void setFailure_GLYLCGQ(Integer failure_GLYLCGQ) {
        this.failure_GLYLCGQ = failure_GLYLCGQ;
    }

    public Integer getFailure_GRZQYLCGQ() {
        return failure_GRZQYLCGQ;
    }

    public void setFailure_GRZQYLCGQ(Integer failure_GRZQYLCGQ) {
        this.failure_GRZQYLCGQ = failure_GRZQYLCGQ;
    }

    public Integer getFailure_PYCYLCGQ() {
        return failure_PYCYLCGQ;
    }

    public void setFailure_PYCYLCGQ(Integer failure_PYCYLCGQ) {
        this.failure_PYCYLCGQ = failure_PYCYLCGQ;
    }

    public Integer getFailure_FSFYCGQ() {
        return failure_FSFYCGQ;
    }

    public void setFailure_FSFYCGQ(Integer failure_FSFYCGQ) {
        this.failure_FSFYCGQ = failure_FSFYCGQ;
    }

    public Integer getFailure_YFJDLCGQ() {
        return failure_YFJDLCGQ;
    }

    public void setFailure_YFJDLCGQ(Integer failure_YFJDLCGQ) {
        this.failure_YFJDLCGQ = failure_YFJDLCGQ;
    }

    public Integer getFailure_GFJDLCGQ() {
        return failure_GFJDLCGQ;
    }

    public void setFailure_GFJDLCGQ(Integer failure_GFJDLCGQ) {
        this.failure_GFJDLCGQ = failure_GFJDLCGQ;
    }

    public Integer getFailure_GLJSDFKCGQ() {
        return failure_GLJSDFKCGQ;
    }

    public void setFailure_GLJSDFKCGQ(Integer failure_GLJSDFKCGQ) {
        this.failure_GLJSDFKCGQ = failure_GLJSDFKCGQ;
    }

    public Integer getFailure_PGWDCGQ_First() {
        return failure_PGWDCGQ_First;
    }

    public void setFailure_PGWDCGQ_First(Integer failure_PGWDCGQ_First) {
        this.failure_PGWDCGQ_First = failure_PGWDCGQ_First;
    }

    public Integer getFailure_PGWDCGQ_Second() {
        return failure_PGWDCGQ_Second;
    }

    public void setFailure_PGWDCGQ_Second(Integer failure_PGWDCGQ_Second) {
        this.failure_PGWDCGQ_Second = failure_PGWDCGQ_Second;
    }

    public Integer getFailure_PGWDCGQ_Third() {
        return failure_PGWDCGQ_Third;
    }

    public void setFailure_PGWDCGQ_Third(Integer failure_PGWDCGQ_Third) {
        this.failure_PGWDCGQ_Third = failure_PGWDCGQ_Third;
    }

    public Integer getFailure_PGWDCGQ_Forth() {
        return failure_PGWDCGQ_Forth;
    }

    public void setFailure_PGWDCGQ_Forth(Integer failure_PGWDCGQ_Forth) {
        this.failure_PGWDCGQ_Forth = failure_PGWDCGQ_Forth;
    }

    public Integer getFailure_PGWDCGQ_Fifth() {
        return failure_PGWDCGQ_Fifth;
    }

    public void setFailure_PGWDCGQ_Fifth(Integer failure_PGWDCGQ_Fifth) {
        this.failure_PGWDCGQ_Fifth = failure_PGWDCGQ_Fifth;
    }

    public Integer getFailure_PGWDCGQ_Sixth() {
        return failure_PGWDCGQ_Sixth;
    }

    public void setFailure_PGWDCGQ_Sixth(Integer failure_PGWDCGQ_Sixth) {
        this.failure_PGWDCGQ_Sixth = failure_PGWDCGQ_Sixth;
    }

    public Integer getFailure_PGWDCGQ_Seventh() {
        return failure_PGWDCGQ_Seventh;
    }

    public void setFailure_PGWDCGQ_Seventh(Integer failure_PGWDCGQ_Seventh) {
        this.failure_PGWDCGQ_Seventh = failure_PGWDCGQ_Seventh;
    }

    public Integer getFailure_PGWDCGQ_Eighth() {
        return failure_PGWDCGQ_Eighth;
    }

    public void setFailure_PGWDCGQ_Eighth(Integer failure_PGWDCGQ_Eighth) {
        this.failure_PGWDCGQ_Eighth = failure_PGWDCGQ_Eighth;
    }

    public Integer getFailure_PGWDCGQ_Ninth() {
        return failure_PGWDCGQ_Ninth;
    }

    public void setFailure_PGWDCGQ_Ninth(Integer failure_PGWDCGQ_Ninth) {
        this.failure_PGWDCGQ_Ninth = failure_PGWDCGQ_Ninth;
    }

    public Integer getFailure_PGWDCGQ_Tenth() {
        return failure_PGWDCGQ_Tenth;
    }

    public void setFailure_PGWDCGQ_Tenth(Integer failure_PGWDCGQ_Tenth) {
        this.failure_PGWDCGQ_Tenth = failure_PGWDCGQ_Tenth;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public Date getyCHQSJ() {
        return yCHQSJ;
    }

    public void setyCHQSJ(Date yCHQSJ) {
        this.yCHQSJ = yCHQSJ;
    }
}
