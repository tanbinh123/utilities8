<?xml version='1.0' encoding='shift_jis'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="xml" omit-xml-declaration="yes" indent="yes"/>
  <xsl:template match="/">
    <span style="color=green">

�h�������������@�e�������@���������������@�����@���{��@�����������|������

</span>
          <p/>  
          
          <xsl:for-each select="//book/author">

           <span style="color=blue" ID="test"> <xsl:value-of select="award"/> </span>
          </xsl:for-each>


       
  
  </xsl:template>
</xsl:stylesheet>
