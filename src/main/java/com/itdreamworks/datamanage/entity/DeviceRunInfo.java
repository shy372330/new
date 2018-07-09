package com.itdreamworks.datamanage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DeviceRunInfo {
     private Integer id,  runstatus, rundays,  fueltype,
     mediatype,glsw_state,  sxsw_state,glyl_state, pattern_number,  fdkg,
     btpywd,pywd, lswd,  ckwd, jnqckwd, jnqrkwd, gswd, ltwd,
     ltckwd,lbwd, rlwd, lfwd,  fyzqwd,grzqwd, hlwd_first,  hlwd_second, hlwd_third,
      hlwd_forth, hlwd_fifth,swwd, zqyl, gsyl, ckyl,  rkyl, ltyl, ltckyl, rqyl,  ycfy, ecfy,rll, zqll,  gsll, xhll,  bsll,glyw, sxyw,
     pyyhl,  lpsdfk, yfscfk,  gfscfk, gsscfk,  mswd, xxwd, pzgyw, szgyw, lnygyw,
     cgyw,  pzgwd, szgwd, cgwd, glyl,  grzqyl, pycyl,fsfy, yfjdl,gfjdl,
     gljsdfk,pgwd_first, pgwd_second,pgwd_third, pgwd_forth,pgwd_fifth,
     pgwd_sixth,pgwd_seventh, pgwd_eighth,pgwd_ninth, pgwd_tenth,paiyanwd,
     bjwd,tlwd, mbwd,qlwd, zhhc,qlhc, qys,hys, qcs,hcs, lbbjwd, ltckbjwd, bhwd,btpywdbjz, jrzs,
     houyanshi,sdwd, mklts,gfhys, yfhys,sxkbwd, lsbjwd,bcxs,
     cankaowd,tlzdz, qlzxz,ckhc, tlwd_first,qowd_first, tlwd_second,qlwd_second, dhcgwd, lstlwd,lsqlwd,
     msbjwd,mstlwd, msqlwd,kbyl, gbyl,pgbjwd, hlbjwd_first,hlkbwd_first,
     hlgbwd_first,hlbjwd_second, hlkbwd_second,hlgbwd_second, hlbjwd_third,hlkbwd_third,
     hlgbwd_third,hlbjwd_forth, hlkbwd_forth,hlgbwd_forth, hlbjwd_fifth,hlkbwd_fifth,
     hlgbwd_fifth, tzsj_first, tzsj_second,tzsj_third, tzsj_forth,tzsj_fifth,
     tzsj_sixth,rsq, jrz,bsb, gsb,byb, xhb,lnb, rsb,
    zkb, ecxhb,yfb, gfj,lp, czj,ecgfj, dhq,  smj, slj,
    jyb, pwb,hlxhb_first, hlxhb_second,hlxhb_third, hlxhb_forth,hlxhb_fifth;
     private String deviceno;
     @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
     private Date jcylsj, yslsj, dhsj,  slqdsj,sltzsj, dhjg,qdsj_first,
             qdsj_second, qdsj_third, qdsj_forth, qdsj_fifth,
     qdsj_sixth,sjhqsj ;

     public Date getSjhqsj() {
      return sjhqsj;
     }

     public void setSjhqsj(Date sjhqsj) {
      this.sjhqsj = sjhqsj;
     }

     public Integer getId() {
      return id;
     }

     public void setId(Integer id) {
      this.id = id;
     }

     public Integer getRunstatus() {
      return runstatus;
     }

     public void setRunstatus(Integer runstatus) {
      this.runstatus = runstatus;
     }

     public Integer getRundays() {
      return rundays;
     }

     public void setRundays(Integer rundays) {
      this.rundays = rundays;
     }

     public Integer getFueltype() {
      return fueltype;
     }

     public void setFueltype(Integer fueltype) {
      this.fueltype = fueltype;
     }

     public Integer getMediatype() {
      return mediatype;
     }

     public void setMediatype(Integer mediatype) {
      this.mediatype = mediatype;
     }

     public Integer getGlsw_state() {
      return glsw_state;
     }

     public void setGlsw_state(Integer glsw_state) {
      this.glsw_state = glsw_state;
     }

     public Integer getSxsw_state() {
      return sxsw_state;
     }

     public void setSxsw_state(Integer sxsw_state) {
      this.sxsw_state = sxsw_state;
     }

     public Integer getGlyl_state() {
      return glyl_state;
     }

     public void setGlyl_state(Integer glyl_state) {
      this.glyl_state = glyl_state;
     }

     public Integer getPattern_number() {
      return pattern_number;
     }

     public void setPattern_number(Integer pattern_number) {
      this.pattern_number = pattern_number;
     }

     public Integer getFdkg() {
      return fdkg;
     }

     public void setFdkg(Integer fdkg) {
      this.fdkg = fdkg;
     }

     public Integer getBtpywd() {
      return btpywd;
     }

     public void setBtpywd(Integer btpywd) {
      this.btpywd = btpywd;
     }

     public Integer getPywd() {
      return pywd;
     }

     public void setPywd(Integer pywd) {
      this.pywd = pywd;
     }

     public Integer getLswd() {
      return lswd;
     }

     public void setLswd(Integer lswd) {
      this.lswd = lswd;
     }

     public Integer getCkwd() {
      return ckwd;
     }

     public void setCkwd(Integer ckwd) {
      this.ckwd = ckwd;
     }

     public Integer getJnqckwd() {
      return jnqckwd;
     }

     public void setJnqckwd(Integer jnqckwd) {
      this.jnqckwd = jnqckwd;
     }

     public Integer getJnqrkwd() {
      return jnqrkwd;
     }

     public void setJnqrkwd(Integer jnqrkwd) {
      this.jnqrkwd = jnqrkwd;
     }

     public Integer getGswd() {
      return gswd;
     }

     public void setGswd(Integer gswd) {
      this.gswd = gswd;
     }

     public Integer getLtwd() {
      return ltwd;
     }

     public void setLtwd(Integer ltwd) {
      this.ltwd = ltwd;
     }

     public Integer getLtckwd() {
      return ltckwd;
     }

     public void setLtckwd(Integer ltckwd) {
      this.ltckwd = ltckwd;
     }

     public Integer getLbwd() {
      return lbwd;
     }

     public void setLbwd(Integer lbwd) {
      this.lbwd = lbwd;
     }

     public Integer getRlwd() {
      return rlwd;
     }

     public void setRlwd(Integer rlwd) {
      this.rlwd = rlwd;
     }

     public Integer getLfwd() {
      return lfwd;
     }

     public void setLfwd(Integer lfwd) {
      this.lfwd = lfwd;
     }

     public Integer getFyzqwd() {
      return fyzqwd;
     }

     public void setFyzqwd(Integer fyzqwd) {
      this.fyzqwd = fyzqwd;
     }

     public Integer getGrzqwd() {
      return grzqwd;
     }

     public void setGrzqwd(Integer grzqwd) {
      this.grzqwd = grzqwd;
     }

     public Integer getHlwd_first() {
      return hlwd_first;
     }

     public void setHlwd_first(Integer hlwd_first) {
      this.hlwd_first = hlwd_first;
     }

     public Integer getHlwd_second() {
      return hlwd_second;
     }

     public void setHlwd_second(Integer hlwd_second) {
      this.hlwd_second = hlwd_second;
     }

     public Integer getHlwd_third() {
      return hlwd_third;
     }

     public void setHlwd_third(Integer hlwd_third) {
      this.hlwd_third = hlwd_third;
     }

     public Integer getHlwd_forth() {
      return hlwd_forth;
     }

     public void setHlwd_forth(Integer hlwd_forth) {
      this.hlwd_forth = hlwd_forth;
     }

     public Integer getHlwd_fifth() {
      return hlwd_fifth;
     }

     public void setHlwd_fifth(Integer hlwd_fifth) {
      this.hlwd_fifth = hlwd_fifth;
     }

     public Integer getSwwd() {
      return swwd;
     }

     public void setSwwd(Integer swwd) {
      this.swwd = swwd;
     }

     public Integer getZqyl() {
      return zqyl;
     }

     public void setZqyl(Integer zqyl) {
      this.zqyl = zqyl;
     }

     public Integer getGsyl() {
      return gsyl;
     }

     public void setGsyl(Integer gsyl) {
      this.gsyl = gsyl;
     }

     public Integer getCkyl() {
      return ckyl;
     }

     public void setCkyl(Integer ckyl) {
      this.ckyl = ckyl;
     }

     public Integer getRkyl() {
      return rkyl;
     }

     public void setRkyl(Integer rkyl) {
      this.rkyl = rkyl;
     }

     public Integer getLtyl() {
      return ltyl;
     }

     public void setLtyl(Integer ltyl) {
      this.ltyl = ltyl;
     }

     public Integer getLtckyl() {
      return ltckyl;
     }

     public void setLtckyl(Integer ltckyl) {
      this.ltckyl = ltckyl;
     }

     public Integer getRqyl() {
      return rqyl;
     }

     public void setRqyl(Integer rqyl) {
      this.rqyl = rqyl;
     }

     public Integer getYcfy() {
      return ycfy;
     }

     public void setYcfy(Integer ycfy) {
      this.ycfy = ycfy;
     }

     public Integer getEcfy() {
      return ecfy;
     }

     public void setEcfy(Integer ecfy) {
      this.ecfy = ecfy;
     }

     public Integer getRll() {
      return rll;
     }

     public void setRll(Integer rll) {
      this.rll = rll;
     }

     public Integer getZqll() {
      return zqll;
     }

     public void setZqll(Integer zqll) {
      this.zqll = zqll;
     }

     public Integer getGsll() {
      return gsll;
     }

     public void setGsll(Integer gsll) {
      this.gsll = gsll;
     }

     public Integer getXhll() {
      return xhll;
     }

     public void setXhll(Integer xhll) {
      this.xhll = xhll;
     }

     public Integer getBsll() {
      return bsll;
     }

     public void setBsll(Integer bsll) {
      this.bsll = bsll;
     }

     public Integer getGlyw() {
      return glyw;
     }

     public void setGlyw(Integer glyw) {
      this.glyw = glyw;
     }

     public Integer getSxyw() {
      return sxyw;
     }

     public void setSxyw(Integer sxyw) {
      this.sxyw = sxyw;
     }

     public Integer getPyyhl() {
      return pyyhl;
     }

     public void setPyyhl(Integer pyyhl) {
      this.pyyhl = pyyhl;
     }

     public Integer getLpsdfk() {
      return lpsdfk;
     }

     public void setLpsdfk(Integer lpsdfk) {
      this.lpsdfk = lpsdfk;
     }

     public Integer getYfscfk() {
      return yfscfk;
     }

     public void setYfscfk(Integer yfscfk) {
      this.yfscfk = yfscfk;
     }

     public Integer getGfscfk() {
      return gfscfk;
     }

     public void setGfscfk(Integer gfscfk) {
      this.gfscfk = gfscfk;
     }

     public Integer getGsscfk() {
      return gsscfk;
     }

     public void setGsscfk(Integer gsscfk) {
      this.gsscfk = gsscfk;
     }

     public Integer getMswd() {
      return mswd;
     }

     public void setMswd(Integer mswd) {
      this.mswd = mswd;
     }

     public Integer getXxwd() {
      return xxwd;
     }

     public void setXxwd(Integer xxwd) {
      this.xxwd = xxwd;
     }

     public Integer getPzgyw() {
      return pzgyw;
     }

     public void setPzgyw(Integer pzgyw) {
      this.pzgyw = pzgyw;
     }

     public Integer getSzgyw() {
      return szgyw;
     }

     public void setSzgyw(Integer szgyw) {
      this.szgyw = szgyw;
     }

     public Integer getLnygyw() {
      return lnygyw;
     }

     public void setLnygyw(Integer lnygyw) {
      this.lnygyw = lnygyw;
     }

     public Integer getCgyw() {
      return cgyw;
     }

     public void setCgyw(Integer cgyw) {
      this.cgyw = cgyw;
     }

     public Integer getPzgwd() {
      return pzgwd;
     }

     public void setPzgwd(Integer pzgwd) {
      this.pzgwd = pzgwd;
     }

     public Integer getSzgwd() {
      return szgwd;
     }

     public void setSzgwd(Integer szgwd) {
      this.szgwd = szgwd;
     }

     public Integer getCgwd() {
      return cgwd;
     }

     public void setCgwd(Integer cgwd) {
      this.cgwd = cgwd;
     }

     public Integer getGlyl() {
      return glyl;
     }

     public void setGlyl(Integer glyl) {
      this.glyl = glyl;
     }

     public Integer getGrzqyl() {
      return grzqyl;
     }

     public void setGrzqyl(Integer grzqyl) {
      this.grzqyl = grzqyl;
     }

     public Integer getPycyl() {
      return pycyl;
     }

     public void setPycyl(Integer pycyl) {
      this.pycyl = pycyl;
     }

     public Integer getFsfy() {
      return fsfy;
     }

     public void setFsfy(Integer fsfy) {
      this.fsfy = fsfy;
     }

     public Integer getYfjdl() {
      return yfjdl;
     }

     public void setYfjdl(Integer yfjdl) {
      this.yfjdl = yfjdl;
     }

     public Integer getGfjdl() {
      return gfjdl;
     }

     public void setGfjdl(Integer gfjdl) {
      this.gfjdl = gfjdl;
     }

     public Integer getGljsdfk() {
      return gljsdfk;
     }

     public void setGljsdfk(Integer gljsdfk) {
      this.gljsdfk = gljsdfk;
     }

     public Integer getPgwd_first() {
      return pgwd_first;
     }

     public void setPgwd_first(Integer pgwd_first) {
      this.pgwd_first = pgwd_first;
     }

     public Integer getPgwd_second() {
      return pgwd_second;
     }

     public void setPgwd_second(Integer pgwd_second) {
      this.pgwd_second = pgwd_second;
     }

     public Integer getPgwd_third() {
      return pgwd_third;
     }

     public void setPgwd_third(Integer pgwd_third) {
      this.pgwd_third = pgwd_third;
     }

     public Integer getPgwd_forth() {
      return pgwd_forth;
     }

     public void setPgwd_forth(Integer pgwd_forth) {
      this.pgwd_forth = pgwd_forth;
     }

     public Integer getPgwd_fifth() {
      return pgwd_fifth;
     }

     public void setPgwd_fifth(Integer pgwd_fifth) {
      this.pgwd_fifth = pgwd_fifth;
     }

     public Integer getPgwd_sixth() {
      return pgwd_sixth;
     }

     public void setPgwd_sixth(Integer pgwd_sixth) {
      this.pgwd_sixth = pgwd_sixth;
     }

     public Integer getPgwd_seventh() {
      return pgwd_seventh;
     }

     public void setPgwd_seventh(Integer pgwd_seventh) {
      this.pgwd_seventh = pgwd_seventh;
     }

     public Integer getPgwd_eighth() {
      return pgwd_eighth;
     }

     public void setPgwd_eighth(Integer pgwd_eighth) {
      this.pgwd_eighth = pgwd_eighth;
     }

     public Integer getPgwd_ninth() {
      return pgwd_ninth;
     }

     public void setPgwd_ninth(Integer pgwd_ninth) {
      this.pgwd_ninth = pgwd_ninth;
     }

     public Integer getPgwd_tenth() {
      return pgwd_tenth;
     }

     public void setPgwd_tenth(Integer pgwd_tenth) {
      this.pgwd_tenth = pgwd_tenth;
     }

     public Integer getPaiyanwd() {
      return paiyanwd;
     }

     public void setPaiyanwd(Integer paiyanwd) {
      this.paiyanwd = paiyanwd;
     }

     public Integer getBjwd() {
      return bjwd;
     }

     public void setBjwd(Integer bjwd) {
      this.bjwd = bjwd;
     }

     public Integer getTlwd() {
      return tlwd;
     }

     public void setTlwd(Integer tlwd) {
      this.tlwd = tlwd;
     }

     public Integer getMbwd() {
      return mbwd;
     }

     public void setMbwd(Integer mbwd) {
      this.mbwd = mbwd;
     }

     public Integer getQlwd() {
      return qlwd;
     }

     public void setQlwd(Integer qlwd) {
      this.qlwd = qlwd;
     }

     public Integer getZhhc() {
      return zhhc;
     }

     public void setZhhc(Integer zhhc) {
      this.zhhc = zhhc;
     }

     public Integer getQlhc() {
      return qlhc;
     }

     public void setQlhc(Integer qlhc) {
      this.qlhc = qlhc;
     }

     public Integer getQys() {
      return qys;
     }

     public void setQys(Integer qys) {
      this.qys = qys;
     }

     public Integer getHys() {
      return hys;
     }

     public void setHys(Integer hys) {
      this.hys = hys;
     }

     public Integer getQcs() {
      return qcs;
     }

     public void setQcs(Integer qcs) {
      this.qcs = qcs;
     }

     public Integer getHcs() {
      return hcs;
     }

     public void setHcs(Integer hcs) {
      this.hcs = hcs;
     }

     public Integer getLbbjwd() {
      return lbbjwd;
     }

     public void setLbbjwd(Integer lbbjwd) {
      this.lbbjwd = lbbjwd;
     }

     public Integer getLtckbjwd() {
      return ltckbjwd;
     }

     public void setLtckbjwd(Integer ltckbjwd) {
      this.ltckbjwd = ltckbjwd;
     }

     public Integer getBhwd() {
      return bhwd;
     }

     public void setBhwd(Integer bhwd) {
      this.bhwd = bhwd;
     }

     public Integer getBtpywdbjz() {
      return btpywdbjz;
     }

     public void setBtpywdbjz(Integer btpywdbjz) {
      this.btpywdbjz = btpywdbjz;
     }

     public Integer getJrzs() {
      return jrzs;
     }

     public void setJrzs(Integer jrzs) {
      this.jrzs = jrzs;
     }

     public Integer getHouyanshi() {
      return houyanshi;
     }

     public void setHouyanshi(Integer houyanshi) {
      this.houyanshi = houyanshi;
     }

     public Integer getSdwd() {
      return sdwd;
     }

     public void setSdwd(Integer sdwd) {
      this.sdwd = sdwd;
     }

     public Integer getMklts() {
      return mklts;
     }

     public void setMklts(Integer mklts) {
      this.mklts = mklts;
     }

     public Integer getGfhys() {
      return gfhys;
     }

     public void setGfhys(Integer gfhys) {
      this.gfhys = gfhys;
     }

     public Integer getYfhys() {
      return yfhys;
     }

     public void setYfhys(Integer yfhys) {
      this.yfhys = yfhys;
     }

     public Integer getSxkbwd() {
      return sxkbwd;
     }

     public void setSxkbwd(Integer sxkbwd) {
      this.sxkbwd = sxkbwd;
     }

     public Integer getLsbjwd() {
      return lsbjwd;
     }

     public void setLsbjwd(Integer lsbjwd) {
      this.lsbjwd = lsbjwd;
     }

     public Integer getBcxs() {
      return bcxs;
     }

     public void setBcxs(Integer bcxs) {
      this.bcxs = bcxs;
     }

     public Integer getCankaowd() {
      return cankaowd;
     }

     public void setCankaowd(Integer cankaowd) {
      this.cankaowd = cankaowd;
     }

     public Integer getTlzdz() {
      return tlzdz;
     }

     public void setTlzdz(Integer tlzdz) {
      this.tlzdz = tlzdz;
     }

     public Integer getQlzxz() {
      return qlzxz;
     }

     public void setQlzxz(Integer qlzxz) {
      this.qlzxz = qlzxz;
     }

     public Integer getCkhc() {
      return ckhc;
     }

     public void setCkhc(Integer ckhc) {
      this.ckhc = ckhc;
     }

     public Integer getTlwd_first() {
      return tlwd_first;
     }

     public void setTlwd_first(Integer tlwd_first) {
      this.tlwd_first = tlwd_first;
     }

     public Integer getQowd_first() {
      return qowd_first;
     }

     public void setQowd_first(Integer qowd_first) {
      this.qowd_first = qowd_first;
     }

     public Integer getTlwd_second() {
      return tlwd_second;
     }

     public void setTlwd_second(Integer tlwd_second) {
      this.tlwd_second = tlwd_second;
     }

     public Integer getQlwd_second() {
      return qlwd_second;
     }

     public void setQlwd_second(Integer qlwd_second) {
      this.qlwd_second = qlwd_second;
     }

     public Integer getDhcgwd() {
      return dhcgwd;
     }

     public void setDhcgwd(Integer dhcgwd) {
      this.dhcgwd = dhcgwd;
     }

     public Integer getLstlwd() {
      return lstlwd;
     }

     public void setLstlwd(Integer lstlwd) {
      this.lstlwd = lstlwd;
     }

     public Integer getLsqlwd() {
      return lsqlwd;
     }

     public void setLsqlwd(Integer lsqlwd) {
      this.lsqlwd = lsqlwd;
     }

     public Integer getMsbjwd() {
      return msbjwd;
     }

     public void setMsbjwd(Integer msbjwd) {
      this.msbjwd = msbjwd;
     }

     public Integer getMstlwd() {
      return mstlwd;
     }

     public void setMstlwd(Integer mstlwd) {
      this.mstlwd = mstlwd;
     }

     public Integer getMsqlwd() {
      return msqlwd;
     }

     public void setMsqlwd(Integer msqlwd) {
      this.msqlwd = msqlwd;
     }

     public Integer getKbyl() {
      return kbyl;
     }

     public void setKbyl(Integer kbyl) {
      this.kbyl = kbyl;
     }

     public Integer getGbyl() {
      return gbyl;
     }

     public void setGbyl(Integer gbyl) {
      this.gbyl = gbyl;
     }

     public Integer getPgbjwd() {
      return pgbjwd;
     }

     public void setPgbjwd(Integer pgbjwd) {
      this.pgbjwd = pgbjwd;
     }

     public Integer getHlbjwd_first() {
      return hlbjwd_first;
     }

     public void setHlbjwd_first(Integer hlbjwd_first) {
      this.hlbjwd_first = hlbjwd_first;
     }

     public Integer getHlkbwd_first() {
      return hlkbwd_first;
     }

     public void setHlkbwd_first(Integer hlkbwd_first) {
      this.hlkbwd_first = hlkbwd_first;
     }

     public Integer getHlgbwd_first() {
      return hlgbwd_first;
     }

     public void setHlgbwd_first(Integer hlgbwd_first) {
      this.hlgbwd_first = hlgbwd_first;
     }

     public Integer getHlbjwd_second() {
      return hlbjwd_second;
     }

     public void setHlbjwd_second(Integer hlbjwd_second) {
      this.hlbjwd_second = hlbjwd_second;
     }

     public Integer getHlkbwd_second() {
      return hlkbwd_second;
     }

     public void setHlkbwd_second(Integer hlkbwd_second) {
      this.hlkbwd_second = hlkbwd_second;
     }

     public Integer getHlgbwd_second() {
      return hlgbwd_second;
     }

     public void setHlgbwd_second(Integer hlgbwd_second) {
      this.hlgbwd_second = hlgbwd_second;
     }

     public Integer getHlbjwd_third() {
      return hlbjwd_third;
     }

     public void setHlbjwd_third(Integer hlbjwd_third) {
      this.hlbjwd_third = hlbjwd_third;
     }

     public Integer getHlkbwd_third() {
      return hlkbwd_third;
     }

     public void setHlkbwd_third(Integer hlkbwd_third) {
      this.hlkbwd_third = hlkbwd_third;
     }

     public Integer getHlgbwd_third() {
      return hlgbwd_third;
     }

     public void setHlgbwd_third(Integer hlgbwd_third) {
      this.hlgbwd_third = hlgbwd_third;
     }

     public Integer getHlbjwd_forth() {
      return hlbjwd_forth;
     }

     public void setHlbjwd_forth(Integer hlbjwd_forth) {
      this.hlbjwd_forth = hlbjwd_forth;
     }

     public Integer getHlkbwd_forth() {
      return hlkbwd_forth;
     }

     public void setHlkbwd_forth(Integer hlkbwd_forth) {
      this.hlkbwd_forth = hlkbwd_forth;
     }

     public Integer getHlgbwd_forth() {
      return hlgbwd_forth;
     }

     public void setHlgbwd_forth(Integer hlgbwd_forth) {
      this.hlgbwd_forth = hlgbwd_forth;
     }

     public Integer getHlbjwd_fifth() {
      return hlbjwd_fifth;
     }

     public void setHlbjwd_fifth(Integer hlbjwd_fifth) {
      this.hlbjwd_fifth = hlbjwd_fifth;
     }

     public Integer getHlkbwd_fifth() {
      return hlkbwd_fifth;
     }

     public void setHlkbwd_fifth(Integer hlkbwd_fifth) {
      this.hlkbwd_fifth = hlkbwd_fifth;
     }

     public Integer getHlgbwd_fifth() {
      return hlgbwd_fifth;
     }

     public void setHlgbwd_fifth(Integer hlgbwd_fifth) {
      this.hlgbwd_fifth = hlgbwd_fifth;
     }

     public Integer getTzsj_first() {
      return tzsj_first;
     }

     public void setTzsj_first(Integer tzsj_first) {
      this.tzsj_first = tzsj_first;
     }

     public Integer getTzsj_second() {
      return tzsj_second;
     }

     public void setTzsj_second(Integer tzsj_second) {
      this.tzsj_second = tzsj_second;
     }

     public Integer getTzsj_third() {
      return tzsj_third;
     }

     public void setTzsj_third(Integer tzsj_third) {
      this.tzsj_third = tzsj_third;
     }

     public Integer getTzsj_forth() {
      return tzsj_forth;
     }

     public void setTzsj_forth(Integer tzsj_forth) {
      this.tzsj_forth = tzsj_forth;
     }

     public Integer getTzsj_fifth() {
      return tzsj_fifth;
     }

     public void setTzsj_fifth(Integer tzsj_fifth) {
      this.tzsj_fifth = tzsj_fifth;
     }

     public Integer getTzsj_sixth() {
      return tzsj_sixth;
     }

     public void setTzsj_sixth(Integer tzsj_sixth) {
      this.tzsj_sixth = tzsj_sixth;
     }

     public Integer getRsq() {
      return rsq;
     }

     public void setRsq(Integer rsq) {
      this.rsq = rsq;
     }

     public Integer getJrz() {
      return jrz;
     }

     public void setJrz(Integer jrz) {
      this.jrz = jrz;
     }

     public Integer getBsb() {
      return bsb;
     }

     public void setBsb(Integer bsb) {
      this.bsb = bsb;
     }

     public Integer getGsb() {
      return gsb;
     }

     public void setGsb(Integer gsb) {
      this.gsb = gsb;
     }

     public Integer getByb() {
      return byb;
     }

     public void setByb(Integer byb) {
      this.byb = byb;
     }

     public Integer getXhb() {
      return xhb;
     }

     public void setXhb(Integer xhb) {
      this.xhb = xhb;
     }

     public Integer getLnb() {
      return lnb;
     }

     public void setLnb(Integer lnb) {
      this.lnb = lnb;
     }

     public Integer getRsb() {
      return rsb;
     }

     public void setRsb(Integer rsb) {
      this.rsb = rsb;
     }

     public Integer getZkb() {
      return zkb;
     }

     public void setZkb(Integer zkb) {
      this.zkb = zkb;
     }

     public Integer getEcxhb() {
      return ecxhb;
     }

     public void setEcxhb(Integer ecxhb) {
      this.ecxhb = ecxhb;
     }

     public Integer getYfb() {
      return yfb;
     }

     public void setYfb(Integer yfb) {
      this.yfb = yfb;
     }

     public Integer getGfj() {
      return gfj;
     }

     public void setGfj(Integer gfj) {
      this.gfj = gfj;
     }

     public Integer getLp() {
      return lp;
     }

     public void setLp(Integer lp) {
      this.lp = lp;
     }

     public Integer getCzj() {
      return czj;
     }

     public void setCzj(Integer czj) {
      this.czj = czj;
     }

     public Integer getEcgfj() {
      return ecgfj;
     }

     public void setEcgfj(Integer ecgfj) {
      this.ecgfj = ecgfj;
     }

     public Integer getDhq() {
      return dhq;
     }

     public void setDhq(Integer dhq) {
      this.dhq = dhq;
     }

     public Integer getSmj() {
      return smj;
     }

     public void setSmj(Integer smj) {
      this.smj = smj;
     }

     public Integer getSlj() {
      return slj;
     }

     public void setSlj(Integer slj) {
      this.slj = slj;
     }

     public Integer getJyb() {
      return jyb;
     }

     public void setJyb(Integer jyb) {
      this.jyb = jyb;
     }

     public Integer getPwb() {
      return pwb;
     }

     public void setPwb(Integer pwb) {
      this.pwb = pwb;
     }

     public Integer getHlxhb_first() {
      return hlxhb_first;
     }

     public void setHlxhb_first(Integer hlxhb_first) {
      this.hlxhb_first = hlxhb_first;
     }

     public Integer getHlxhb_second() {
      return hlxhb_second;
     }

     public void setHlxhb_second(Integer hlxhb_second) {
      this.hlxhb_second = hlxhb_second;
     }

     public Integer getHlxhb_third() {
      return hlxhb_third;
     }

     public void setHlxhb_third(Integer hlxhb_third) {
      this.hlxhb_third = hlxhb_third;
     }

     public Integer getHlxhb_forth() {
      return hlxhb_forth;
     }

     public void setHlxhb_forth(Integer hlxhb_forth) {
      this.hlxhb_forth = hlxhb_forth;
     }

     public Integer getHlxhb_fifth() {
      return hlxhb_fifth;
     }

     public void setHlxhb_fifth(Integer hlxhb_fifth) {
      this.hlxhb_fifth = hlxhb_fifth;
     }

     public String getDeviceno() {
      return deviceno;
     }

     public void setDeviceno(String deviceno) {
      this.deviceno = deviceno;
     }

     public Date getJcylsj() {
      return jcylsj;
     }

     public void setJcylsj(Date jcylsj) {
      this.jcylsj = jcylsj;
     }

     public Date getYslsj() {
      return yslsj;
     }

     public void setYslsj(Date yslsj) {
      this.yslsj = yslsj;
     }

     public Date getDhsj() {
      return dhsj;
     }

     public void setDhsj(Date dhsj) {
      this.dhsj = dhsj;
     }

     public Date getSlqdsj() {
      return slqdsj;
     }

     public void setSlqdsj(Date slqdsj) {
      this.slqdsj = slqdsj;
     }

     public Date getSltzsj() {
      return sltzsj;
     }

     public void setSltzsj(Date sltzsj) {
      this.sltzsj = sltzsj;
     }

     public Date getDhjg() {
      return dhjg;
     }

     public void setDhjg(Date dhjg) {
      this.dhjg = dhjg;
     }

     public Date getQdsj_first() {
      return qdsj_first;
     }

     public void setQdsj_first(Date qdsj_first) {
      this.qdsj_first = qdsj_first;
     }

     public Date getQdsj_second() {
      return qdsj_second;
     }

     public void setQdsj_second(Date qdsj_second) {
      this.qdsj_second = qdsj_second;
     }

     public Date getQdsj_third() {
      return qdsj_third;
     }

     public void setQdsj_third(Date qdsj_third) {
      this.qdsj_third = qdsj_third;
     }

     public Date getQdsj_forth() {
      return qdsj_forth;
     }

     public void setQdsj_forth(Date qdsj_forth) {
      this.qdsj_forth = qdsj_forth;
     }

     public Date getQdsj_fifth() {
      return qdsj_fifth;
     }

     public void setQdsj_fifth(Date qdsj_fifth) {
      this.qdsj_fifth = qdsj_fifth;
     }

     public Date getQdsj_sixth() {
      return qdsj_sixth;
     }

     public void setQdsj_sixth(Date qdsj_sixth) {
      this.qdsj_sixth = qdsj_sixth;
     }
}
