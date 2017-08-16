<?xml version='1.0'?>
<fooxsl:stylesheet xmlns:fooxsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
xmlns:dt="urn:uuid:C2F41010-65B3-11d1-A29F-00AA00C14882/" xmlns:my="urn:http//www.placeholder-name-here.com/schema/"
>
<fooxsl:template match="bookstore/book">
   
          
          <fooxsl:apply-templates select="author"/>

           

          

		

 </fooxsl:template>

 <fooxsl:template match="author" priority="1">
- <SPAN style="color=green" ID="test">
  <fooxsl:value-of select="my:country" /> 
  </SPAN>
  </fooxsl:template>

 

 <fooxsl:template match="author" priority="-.5">
- <SPAN style="color=red" ID="test">
  <fooxsl:value-of select="my:country" /> 
  </SPAN>
  </fooxsl:template>


 <fooxsl:template match="text()"/>	


</fooxsl:stylesheet>
