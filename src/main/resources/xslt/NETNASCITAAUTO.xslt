<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
    xmlns:mstns="http://tempuri.org/EstrNas.xsd"
>
  <xsl:template match="estrattoNascita">
    <div style="font-family:Times New Roman;font-size:10pt;">
      <p align="left">
        <xsl:choose>
          <xsl:when test="count(./Codice) &gt; 0">
            <p align="left">
              <p align="left">
                <p align="left">
                  <xsl:value-of select="./Descrizione"/>CIAO
                </p>
              </p>
            </p>
          </xsl:when>
          <xsl:when test="count(./CodiceIndividuale) &gt; 0">
            <p align="center">
              <xsl:value-of select="./Ufficio"/>
            </p>
            <p align="center">
              <xsl:value-of select="./EstrTesto"/>
            </p>
            <p align="center">
              <xsl:value-of select="./Risultanze"/>
            </p>
            <br />
            <p align="left">
              <xsl:value-of select="./Atto"/>
            </p>
            <br />
            <p align="center">
              certifica che
            </p>
            <br />
            <p align="left">
              <xsl:value-of select="./CognomeNome"/>
              <xsl:if test="./Paternita != ''">
                <xsl:value-of select="./Paternita"/>
                <br />
              </xsl:if>
              <xsl:value-of select="./DataNas"/>
              <br />
              <xsl:value-of select="./LuoNas"/>
            </p>
            <p>
              <br />
            </p>
            <p align="left" height="200px" width="100%" style="font-size:8pt">
              <xsl:value-of select="./HTML"/>
            </p>
            <br />
            <xsl:if test="./Paternita != ''">
              <p align="left">
                Rilasciata ai sensi dell'art 3 del D.P.R. 2/5/1957 n.432 a richiesta della parte interessata.
              </p>
              <br />
              <br />
            </xsl:if>
            <br />
            <div style="text-align:center;">
              <p>
                <xsl:value-of select="./Firma"/>
              </p>
              <p>
                <xsl:value-of select="./Utente"/>
              </p>
              <br />
              <p style="font-size:8pt">
                <xsl:value-of select="./Sostituita"/>
              </p>
            </div>
            <br />
            <br />
            <p align="left">
              <xsl:value-of select="./Today"/>
            </p>
            <br />
            <br />
            <p align="left" style="font-size:8pt">
              Per uso elettorale.
            </p>
          </xsl:when>
        </xsl:choose>
      </p>
    </div>
  </xsl:template>
</xsl:stylesheet>
