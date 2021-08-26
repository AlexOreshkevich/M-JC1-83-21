package by.academy.jc.skopinov.ht4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution4Test {

  @Test
  void input00Line1() {
    assertEquals("Nayeem loves counseling", Solution4.extractingContent("<h1>Nayeem loves counseling</h1>"));
  }

  @Test
  void input00Line2() {
    assertEquals("Sanjay has no watch", Solution4.extractingContent("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>"));
  }

  @Test
  void input00Line3() {
    assertEquals("None", Solution4.extractingContent("<Amee>safat codes like a ninja</amee>"));
  }

  @Test
  void input00Line4() {
    assertEquals("Imtiaz has a secret crash", Solution4.extractingContent("<SA premium>Imtiaz has a secret crash</SA premium>"));
  }

  @Test
  void input01Line1() {
    assertEquals("some", Solution4.extractingContent("<h1>some</h1>"));
  }

  @Test
  void input01Line2() {
    assertEquals("public", Solution4.extractingContent("<h1>had<h1>public</h1></h1>"));
  }

  @Test
  void input01Line3() {
    assertEquals("None", Solution4.extractingContent("<h1>had<h1>public</h1515></h1>"));
  }

  @Test
  void input01Line4() {
    assertEquals("None", Solution4.extractingContent("<h1><h1></h1></h1>"));
  }

  @Test
  void input01Line5() {
    assertEquals("None", Solution4.extractingContent("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"));
  }

  @Test
  void input01Line6() {
    assertEquals("None", Solution4.extractingContent(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"));
  }

  @Test
  void input01Line7() {
    assertEquals("None", Solution4.extractingContent("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>"));
  }

  @Test
  void input01Line8() {
    assertEquals("None", Solution4.extractingContent("<>hello</>"));
  }

  @Test
  void input01Line9() {
    assertEquals("dim", Solution4.extractingContent("<>hello</><h>dim</h>"));
  }

  @Test
  void input01Line10() {
    assertEquals("dim", Solution4.extractingContent("<>hello</><h>dim</h>>>>>"));
  }

  @Test
  void input02Line1() {
    assertEquals("bMUGux)5n7L={M}e^`0xlSm5ce}ehiE}CJ6y0KPd~~B~ak5$PTdPGv}QnXpw6n9V8wVCVaTRTgLKkeF", Solution4
        .extractingContent("qqoNVOmJDG@6IBDZoEmk9337LswEL&TQnLCuR`04XD%1t{G)Jmi_iNEXKwp&<iBKMbDGtF4v@coLsF1_LqgTJ3cSp& 3a~I&Q(j0h_w~Vk(oBZCL#vhYY9%c><wkjkTvAuA8Zk}n_l7Si\"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>bMUGux)5n7L={M}e^`0xlSm5ce}ehiE}CJ6y0KPd~~B~ak5$PTdPGv}QnXpw6n9V8wVCVaTRTgLKkeF</wkjkTvAuA8Zk}n_l7Si\"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>haZQKlWPxlRqXXkKHo=FDofc6$_S-GWA&m0zT*D~uorf_nAF^ym*U&6hGAI)s<XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><FbTSC#F104{py9Xl6s{yi-R~}k5Fv4i1kCgmBY7P=vVj-j48xUg8x9BCxl~Y><lyxRRMqnMBGj1_d7Qqh5Ebn7 aMb{Q0Dm){9~I0DTS8BZ7+bui~)rQ\"2Yb4f>EeZWvJvHIk</XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><BkkZV631Pnj}#%TWhZn@Y><kXjDpTvLA^tnXYb`h+cA J2"));
  }

  @Test
  void input02Line2() {
    assertEquals("YjncQJp=mN8OV9WEviqvJT`YS$WD=^gryB)NWAal", Solution4.extractingContent("wRhDGQCG`r N4=cWqp4jF\"#I7#)jofKUYktmjH(\"s2nD4+NxsN)tpCf2U@78MsGNbEgSgR=6`\"y685~I(D-p&T2BnaJNa%S%y9pYMb_9v{PlScQ7R=~~xnSkpSd<orcsjzalN#eslhhH2d\"1MD)pzc*$tBG-mmI_*zW><xMphtS-F8MVM^u2n5tN2DthGw{KZ`y7)><ZpjQU2&UMjzwJwnV70-CiM}M-OvR%a)Vk3R}2><DqcnlvJJa7ZYYrX^M*BI^*A_-mm0 HT4i^syNtujpEE8M@><mpX{FWXe#$d`)QdqT#eBbH=EJOXc@cFhxpJg14#*G0 o-w9G++`GA9U><PbwFCKiY2D^jhX_l7fM}tsB6QKv#@U#g%P%><WNbHpmOM# X_$FjjX$49DedlEf~_d&3j`LU9OLM%@y)2u^A5aO#><gXzyXZFrpOGaC+M4)kG`d5L*lRW5A#O0i=V023f_iSwqL$_qRMp59PW gf6><GfYTkjn{CTWM-U@3Wv(h( ~Cnc9&BKA>YjncQJp=mN8OV9WEviqvJT`YS$WD=^gryB)NWAal</GfYTkjn{CTWM-U@3Wv(h( ~Cnc9&BKA>QMewBnIzsV</WNbHpmOM# X_$FjjX$49DedlEf~_d&3j`LU9OLM%@y)2u^A5aO#></PbwFCKiY2D^jhX_l7fM}tsB6QKv#@U#g%P%>dPcdFnfTMuYyOFExhXoymEYRVptmHjbgR</ZpjQU2&UMjzwJwnV70-CiM}M-OvR%a)Vk3R}2>wDegwAFAmjapXOejj</xMphtS-F8MVM^u2n5tN2DthGw{KZ`y7)>gEpaCbApodfJVPXVuct<bbgnEsMI_M%9L=E v)f6GjS_kSK6W5HWdel)VbBvZRG)#&b=+6k(O9=&C>rulVew89#uyWF}4`T\"xULOZ%1\"5Cu)&x7qD0</bbgnEsMI_M%9L=E v)f6GjS_kSK6W5HWdel)VbBvZRG)#&b=+6k(O9=&C><RicmJtmTo9uWkW^szFhT_O"));
  }


  @Test
  void firstCheck1() {
    assertEquals("None", Solution4.extractingContent("<Amee>safat codes like a ninja<Amee>"));
  }

  @Test
  void firstCheck2() {
    assertEquals("", Solution4.extractingContent("<mee>safat codes like a ninja</Amee>"));
  }

  @Test
  void firstCheck3() {
    assertEquals("", Solution4.extractingContent("<m>s</A>"));
  }

  @Test
  void secondCheck1() {
    assertEquals("some", Solution4.extractingContent("<h1>some</h1>"));
  }

  @Test
  void secondCheck2() {
    assertEquals("None", Solution4.extractingContent("<H1>some</h1>"));
  }

  @Test
  void secondCheck3() {
    assertEquals("None", Solution4.extractingContent("<h1>some<h11>"));
  }
}