<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
		xmlns:ped="ped.com"
		xmlns:bdd="bdd.com"
		xmlns="bubba.com"
	exclude-result-prefixes="ped #default">

  <!-- FileName: namespace20 -->
  <!-- Document: http://www.w3.org/TR/xslt -->
  <!-- DocVersion: 19991116 -->
  <!-- Section: 7.1.1 Literal Result Elements  -->
  <!-- Creator: Paul Dick -->
  <!-- Purpose: Test exclude-result-prefixes. -->

<xsl:template match="doc">
  <out><xsl:text>&#010;</xsl:text>
    <xsl:for-each select='document("")//ped:test'><xsl:copy/><xsl:text>&#010;</xsl:text></xsl:for-each>
    <xsl:for-each select='document("")//bdd:test'><xsl:copy/><xsl:text>&#010;</xsl:text></xsl:for-each>
    <test>Test5</test>
    <test xmlns="missing.com">Test6</test><xsl:text>&#010;</xsl:text>
  </out>
</xsl:template>

<ped:test>Test1</ped:test>
<test xmlns="ped.com">Test2</test>
<ped:test xmlns:ped="ped2.com">Test3</ped:test>
<bdd:test>Test4</bdd:test>

</xsl:stylesheet>