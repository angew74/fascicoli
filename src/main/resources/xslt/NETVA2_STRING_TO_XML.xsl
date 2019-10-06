<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/">
        <NETVA2 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
            <xsl:choose>
                <xsl:when test="//MSGERR != ''">
                    <Messaggio>
                        <xsl:value-of select="//MSGERR"/>
                    </Messaggio>
                </xsl:when>
                <xsl:when test="//ELENCO != ''">
                    <Elenco>
                        <xsl:for-each select="//ELENCO">
                            <xsl:if test="./CIND  != ''">
                                <PersonaElenco>
                                    <CodiceIndividuale>
                                        <xsl:value-of select="./CIND"/>
                                    </CodiceIndividuale>
                                    <xsl:if test="./NOME != ''">
                                        <Nome>
                                            <xsl:value-of select="./NOME"/>
                                        </Nome>
                                    </xsl:if>
                                    <xsl:if test="./COGNOME != ''">
                                        <Cognome>
                                            <xsl:value-of select="./COGNOME"/>
                                        </Cognome>
                                    </xsl:if>
                                    <xsl:if test="./GNAS != '' or ./MNAS != '' or ./ANAS != ''">
                                        <DatadiNascita>
                                            <xsl:if test="./GNAS != ''">
                                                <Giorno>
                                                    <xsl:value-of select="./GNAS"/>
                                                </Giorno>
                                            </xsl:if>
                                            <xsl:if test="./MNAS != ''">
                                                <Mese>
                                                    <xsl:value-of select="./MNAS"/>
                                                </Mese>
                                            </xsl:if>
                                            <xsl:if test="./ANAS != ''">
                                                <Anno>
                                                    <xsl:value-of select="./ANAS"/>
                                                </Anno>
                                            </xsl:if>
                                        </DatadiNascita>
                                        <xsl:if test="./SEX != ''">
                                            <Sesso>
                                                <xsl:value-of select="./SEX"/>
                                            </Sesso>
                                        </xsl:if>
                                        <xsl:if test="./INDIRIZZO!= ''">
                                            <Indirizzo>
                                                <xsl:value-of select="./INDIRIZZO"/>
                                            </Indirizzo>
                                        </xsl:if>
                                        <xsl:if test="./STATUS != ''">
                                            <FlagVivoResidente>
                                                <xsl:value-of select="./STATUS"/>
                                            </FlagVivoResidente>
                                        </xsl:if>
                                        <xsl:if test="./CODFIS != ''">
                                            <CodiceFiscale>
                                                <xsl:value-of select="./CODFIS"/>
                                            </CodiceFiscale>
                                        </xsl:if>
                                    </xsl:if>
                                    <Descrizione>
                                        <xsl:value-of select="./NOME"></xsl:value-of>&#160;
                                        <xsl:value-of select="./COGNOME"	></xsl:value-of>	&#160;
                                        <xsl:value-of select="./GNAS" />/<xsl:value-of select="./MNAS"/>/<xsl:value-of select="./ANAS"/>&#160;
                                        <xsl:value-of select="./DESCSTATUS"></xsl:value-of>&#160;
                                        <xsl:value-of select="./CIND"></xsl:value-of>
                                    </Descrizione>
                                </PersonaElenco>
                            </xsl:if>
                        </xsl:for-each>
                    </Elenco>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:for-each select="//INDIVIDUO">
                        <xsl:if test="./CIND != ''">
                            <Persona>
                                <DatiAnagrafeRoma>
                                    <DatiIndividuo>
                                        <CodiceIndividuale>
                                            <xsl:value-of select="./CIND"/>
                                        </CodiceIndividuale>
                                        <xsl:if test="./FVR != ''">
                                            <TipoIndividuo>
                                                <FlagVivoResidente>
                                                    <xsl:value-of select="./FVR"/>
                                                </FlagVivoResidente>
                                                <xsl:if test="./FV != ''">
                                                    <Vivo>
                                                        <xsl:value-of select="./FV"/>
                                                    </Vivo>
                                                </xsl:if>
                                                <xsl:if test="./FR != ''">
                                                    <Residente>
                                                        <xsl:value-of select="./FR"/>
                                                    </Residente>
                                                </xsl:if>
                                            </TipoIndividuo>
                                        </xsl:if>
                                    </DatiIndividuo>
                                    <xsl:if test="./CFAM != ''">
                                        <DatiFamiglia>
                                            <CodiceFamiglia>
                                                <xsl:value-of select="./CFAM"/>
                                            </CodiceFamiglia>
                                            <xsl:if test="./FPRFAM != ''">
                                                <FlagPresenzaInFamiglia>
                                                    <xsl:value-of select="./FPRFAM"/>
                                                </FlagPresenzaInFamiglia>
                                            </xsl:if>
                                        </DatiFamiglia>
                                    </xsl:if>
                                </DatiAnagrafeRoma>
                                <PersonaCompleta>
                                    <xsl:if test="./SEX != ''">
                                        <Sesso>
                                            <xsl:value-of select="./SEX"/>
                                        </Sesso>
                                    </xsl:if>
                                    <xsl:if test="./NOME != ''">
                                        <Nome>
                                            <xsl:value-of select="./NOME"/>
                                        </Nome>
                                    </xsl:if>
                                    <xsl:if test="./COGN != ''">
                                        <Cognome>
                                            <xsl:value-of select="./COGN"/>
                                        </Cognome>
                                    </xsl:if>
                                    <xsl:if test="./GNAS != '' or ./MNAS != '' or ./ANAS != ''">
                                        <DatadiNascita>
                                            <xsl:if test="./GNAS != ''">
                                                <Giorno>
                                                    <xsl:value-of select="./GNAS"/>
                                                </Giorno>
                                            </xsl:if>
                                            <xsl:if test="./MNAS != ''">
                                                <Mese>
                                                    <xsl:value-of select="./MNAS"/>
                                                </Mese>
                                            </xsl:if>
                                            <xsl:if test="./ANAS != ''">
                                                <Anno>
                                                    <xsl:value-of select="./ANAS"/>
                                                </Anno>
                                            </xsl:if>
                                        </DatadiNascita>
                                    </xsl:if>
                                    <xsl:if test="./COMNAS != ''">
                                        <LuogodiNascita>
                                            <NomeComune>
                                                <xsl:value-of select="./COMNAS"/>
                                            </NomeComune>
                                            <xsl:if test="./PRCNAS != ''">
                                                <SiglaProvincia>
                                                    <xsl:value-of select="./PRCNAS"/>
                                                </SiglaProvincia>
                                            </xsl:if>
                                            <xsl:if test="./NAZCNAS != ''">
                                                <SiglaStato>
                                                    <xsl:value-of select="./NAZCNAS"/>
                                                </SiglaStato>
                                            </xsl:if>
                                            <xsl:if test="./DNAZCNAS != ''">
                                                <NomeStato>
                                                    <xsl:value-of select="./DNAZCNAS"/>
                                                </NomeStato>
                                            </xsl:if>
                                            <xsl:if test="./ICNAS != ''">
                                                <CodiceComuneISTAT>
                                                    <xsl:value-of select="./ICNAS"/>
                                                </CodiceComuneISTAT>
                                            </xsl:if>
                                            <xsl:if test="./IPRCNAS != ''">
                                                <CodiceProvinciaISTAT>
                                                    <xsl:value-of select="./IPRCNAS"/>
                                                </CodiceProvinciaISTAT>
                                            </xsl:if>
                                            <xsl:if test="./INAZCNAS != ''">
                                                <CodiceStatoISTAT>
                                                    <xsl:value-of select="./INAZCNAS"/>
                                                </CodiceStatoISTAT>
                                            </xsl:if>
                                        </LuogodiNascita>
                                    </xsl:if>
                                    <xsl:if test="./CODFIS != ''">
                                        <CodiceFiscale>
                                            <xsl:value-of select="./CODFIS"/>
                                        </CodiceFiscale>
                                    </xsl:if>
                                    <xsl:if test="./DESCIT != '' or ./ISTNAZ !=''">
                                        <Cittadinanza>
                                            <xsl:if test="./DESCIT !=''">
                                                <DescrizioneCittadinanza>
                                                    <xsl:value-of select="./DESCIT"/>
                                                </DescrizioneCittadinanza>
                                            </xsl:if>
                                            <xsl:if test="./ISTNAZ !=''">
                                                <CodiceStatoISTAT>
                                                    <xsl:value-of select="./ISTNAZ"/>
                                                </CodiceStatoISTAT>
                                            </xsl:if>
                                        </Cittadinanza>
                                    </xsl:if>
                                    <xsl:if test="./STATCIV != ''">
                                        <StatoCivile>
                                            <xsl:value-of select="./STATCIV"/>
                                        </StatoCivile>
                                    </xsl:if>
                                    <xsl:if test="./TIST != ''">
                                        <TitolodiStudio>
                                            <xsl:value-of select="./TIST"/>
                                        </TitolodiStudio>
                                    </xsl:if>
                                    <xsl:if test="./PROF != ''">
                                        <Professione>
                                            <xsl:value-of select="./PROF"/>
                                        </Professione>
                                    </xsl:if>
                                </PersonaCompleta>
                                <xsl:if test="./VIA != '' or ./AIREIND != ''">
                                    <DatiIndirizzo>
                                        <Indirizzo>
                                            <xsl:if test="./VIA != ''">
                                                <IndirizzoItaliano>
                                                    <CodiceVia>
                                                        <xsl:value-of select="./CVIA"/>
                                                    </CodiceVia>
                                                    <Toponimo>
                                                        <xsl:value-of select="./VIA"/>
                                                    </Toponimo>
                                                    <xsl:if test="./CIV != ''">
                                                        <NumeroCivico>
                                                            <Numero>
                                                                <xsl:value-of select="./CIV"/>
                                                            </Numero>
                                                            <xsl:if test="./LET != ''">
                                                                <Lettera>
                                                                    <xsl:value-of select="./LET"/>
                                                                </Lettera>
                                                            </xsl:if>
                                                        </NumeroCivico>
                                                    </xsl:if>
                                                    <xsl:if test="./LOT != ''">
                                                        <Lotto>
                                                            <xsl:value-of select="./LOT"/>
                                                        </Lotto>
                                                    </xsl:if>
                                                    <xsl:if test="./PAL != ''">
                                                        <Palazzina>
                                                            <xsl:value-of select="./PAL"/>
                                                        </Palazzina>
                                                    </xsl:if>
                                                    <xsl:if test="./KM != ''">
                                                        <Kilometro>
                                                            <xsl:value-of select="./KM"/>
                                                        </Kilometro>
                                                    </xsl:if>
                                                    <xsl:if test="./SCA != ''">
                                                        <Scala>
                                                            <xsl:value-of select="./SCA"/>
                                                        </Scala>
                                                    </xsl:if>
                                                    <xsl:if test="./PIA != ''">
                                                        <Piano>
                                                            <xsl:value-of select="./PIA"/>
                                                        </Piano>
                                                    </xsl:if>
                                                    <xsl:if test="./INT != ''">
                                                        <Interno>
                                                            <xsl:value-of select="./INT"/>
                                                        </Interno>
                                                    </xsl:if>
                                                    <xsl:if test="./MUN != ''">
                                                        <Municipio>
                                                            <xsl:value-of select="./MUN"/>
                                                        </Municipio>
                                                    </xsl:if>
                                                </IndirizzoItaliano>
                                            </xsl:if>
                                            <xsl:if test="./AIREIND != ''">
                                                <IndirizzoEstero>
                                                    <Testo>
                                                        <xsl:value-of select="./AIREIND"/>
                                                    </Testo>
                                                </IndirizzoEstero>
                                            </xsl:if>
                                        </Indirizzo>
                                        <xsl:if test="./PROTDOM != ''">
                                            <ProtocolloDomicilio>
                                                <NumeroProtocollo>
                                                    <xsl:value-of select="./PROTDOM"/>
                                                </NumeroProtocollo>
                                            </ProtocolloDomicilio>
                                        </xsl:if>
                                    </DatiIndirizzo>
                                </xsl:if>
                                <xsl:if test="./GNAS != '' or ./MNAS != '' or ./ANAS != '' or ./COMNAS != '' or ./NATTNAS != '' or ./PATTNAS != '' or ./SATTNAS != '' or ./AANAS != '' or ./TIPRGNAS != '' or ./COMRGNAS != ''">
                                    <Nascita>
                                        <xsl:if test="./GNAS != '' or ./MNAS != '' or ./ANAS != ''">
                                            <DatadiNascita>
                                                <xsl:if test="./GNAS != ''">
                                                    <Giorno>
                                                        <xsl:value-of select="./GNAS"/>
                                                    </Giorno>
                                                </xsl:if>
                                                <xsl:if test="./MNAS != ''">
                                                    <Mese>
                                                        <xsl:value-of select="./MNAS"/>
                                                    </Mese>
                                                </xsl:if>
                                                <xsl:if test="./ANAS != ''">
                                                    <Anno>
                                                        <xsl:value-of select="./ANAS"/>
                                                    </Anno>
                                                </xsl:if>
                                            </DatadiNascita>
                                        </xsl:if>
                                        <xsl:if test="./COMNAS != ''">
                                            <LuogodiNascita>
                                                <NomeComune>
                                                    <xsl:value-of select="./COMNAS"/>
                                                </NomeComune>
                                                <xsl:if test="./PRCNAS != ''">
                                                    <SiglaProvincia>
                                                        <xsl:value-of select="./PRCNAS"/>
                                                    </SiglaProvincia>
                                                </xsl:if>
                                                <xsl:if test="./NAZCNAS != ''">
                                                    <SiglaStato>
                                                        <xsl:value-of select="./NAZCNAS"/>
                                                    </SiglaStato>
                                                </xsl:if>
                                                <xsl:if test="./DNAZCNAS != ''">
                                                    <NomeStato>
                                                        <xsl:value-of select="./DNAZCNAS"/>
                                                    </NomeStato>
                                                </xsl:if>
                                                <xsl:if test="./ICNAS != ''">
                                                    <CodiceComuneISTAT>
                                                        <xsl:value-of select="./ICNAS"/>
                                                    </CodiceComuneISTAT>
                                                </xsl:if>
                                                <xsl:if test="./IPRCNAS != ''">
                                                    <CodiceProvinciaISTAT>
                                                        <xsl:value-of select="./IPRCNAS"/>
                                                    </CodiceProvinciaISTAT>
                                                </xsl:if>
                                                <xsl:if test="./INAZCNAS != ''">
                                                    <CodiceStatoISTAT>
                                                        <xsl:value-of select="./INAZCNAS"/>
                                                    </CodiceStatoISTAT>
                                                </xsl:if>
                                            </LuogodiNascita>
                                        </xsl:if>
                                        <xsl:if test="./NATTNAS != '' or ./PATTNAS != '' or ./SATTNAS != '' or ./AANAS != '' or ./TIPRGNAS !='' or ./COMRGNAS !=''">
                                            <AttodiNascita>
                                                <xsl:if test="./TIPRGNAS != ''">
                                                    <TipoRegistrazione>
                                                        <xsl:value-of select="./TIPRGNAS"/>
                                                    </TipoRegistrazione>
                                                </xsl:if>
                                                <xsl:if test="./COMRGNAS != ''">
                                                    <ComuneRegistrazione>
                                                        <NomeComune>
                                                            <xsl:value-of select="./COMRGNAS"/>
                                                        </NomeComune>
                                                        <xsl:if test="./PRCRGNAS != ''">
                                                            <SiglaProvincia>
                                                                <xsl:value-of select="./PRCRGNAS"/>
                                                            </SiglaProvincia>
                                                        </xsl:if>
                                                        <xsl:if test="./NAZCRGNAS != ''">
                                                            <SiglaStato>
                                                                <xsl:value-of select="./NAZCRGNAS"/>
                                                            </SiglaStato>
                                                        </xsl:if>
                                                        <xsl:if test="./DNAZCRGNAS != ''">
                                                            <NomeStato>
                                                                <xsl:value-of select="./DNAZCRGNAS"/>
                                                            </NomeStato>
                                                        </xsl:if>
                                                        <xsl:if test="./ICRGNAS != ''">
                                                            <CodiceComuneISTAT>
                                                                <xsl:value-of select="./ICRGNAS"/>
                                                            </CodiceComuneISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./IPRCRGNAS != ''">
                                                            <CodiceProvinciaISTAT>
                                                                <xsl:value-of select="./IPRCRGNAS"/>
                                                            </CodiceProvinciaISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./INAZCNAS != ''">
                                                            <CodiceStatoISTAT>
                                                                <xsl:value-of select="./INAZCRGNAS"/>
                                                            </CodiceStatoISTAT>
                                                        </xsl:if>
                                                    </ComuneRegistrazione>
                                                </xsl:if>
                                                <xsl:if test="./NATTNAS != ''">
                                                    <Numero>
                                                        <xsl:value-of select="./NATTNAS"/>
                                                    </Numero>
                                                </xsl:if>
                                                <xsl:if test="./PATTNAS != ''">
                                                    <Parte>
                                                        <xsl:value-of select="./PATTNAS"/>
                                                    </Parte>
                                                </xsl:if>
                                                <Serie>
                                                    <xsl:value-of select="./SATTNAS"/>
                                                </Serie>
                                                <xsl:if test="./EATTNAS != ''">
                                                    <Esponente>
                                                        <xsl:value-of select="./EATTNAS"/>
                                                    </Esponente>
                                                </xsl:if>
                                                <xsl:if test="./AANAS != ''">
                                                    <Anno>
                                                        <xsl:value-of select="./AANAS"/>
                                                    </Anno>
                                                </xsl:if>
                                            </AttodiNascita>
                                        </xsl:if>
                                        <xsl:if test="./PAT1 != '' or ./MAT != ''">
                                            <Genitori>
                                                <xsl:if test="./PAT1 != ''">
                                                    <Padre>
                                                        <Nominativo>
                                                            <xsl:value-of select="./PAT1"/>
                                                        </Nominativo>
                                                    </Padre>
                                                </xsl:if>
                                                <xsl:if test="./MAT != ''">
                                                    <Madre>
                                                        <Nominativo>
                                                            <xsl:value-of select="./MAT"/>
                                                        </Nominativo>
                                                    </Madre>
                                                </xsl:if>
                                            </Genitori>
                                        </xsl:if>
                                    </Nascita>
                                </xsl:if>
                                <xsl:if test="./GMAT != '' or ./MMAT != '' or ./AMAT != '' or ./COMMAT != '' or ./NATTMAT != '' or ./PATTMAT != '' or ./SATTMAT != '' or ./AAMAT != '' or ./TIPRGMAT != '' or ./COMRGMAT != '' or ./CCNG != '' or ./COGNC != '' or ./NOMEC != '' or ./SEXC != ''">
                                    <Matrimonio>
                                        <xsl:if test="./CCNG != ''">
                                            <DatiConiuge>
                                                <Coniuge>
                                                    <CodiceIndividuale>
                                                        <xsl:value-of select="./CCNG"/>
                                                    </CodiceIndividuale>
                                                    <xsl:if test="./COGNC != ''">
                                                        <Cognome>
                                                            <xsl:value-of select="./COGNC"/>
                                                        </Cognome>
                                                    </xsl:if>
                                                    <xsl:if test="./NOMEC != ''">
                                                        <Nome>
                                                            <xsl:value-of select="./NOMEC"/>
                                                        </Nome>
                                                    </xsl:if>
                                                    <xsl:if test="./SEXC != ''">
                                                        <Sesso>
                                                            <xsl:value-of select="./SEXC"/>
                                                        </Sesso>
                                                    </xsl:if>
                                                </Coniuge>
                                                <xsl:if test="./GDECC != '' or ./MDECC != '' or ./ADECC != '' or ./COMDECC != '' or ./NATTDECC != '' or ./PATTDECC != '' or ./SATTDECC != '' or ./AADECC != '' or ./TIPRGDECC != '' or ./COMRGDECC != ''">
                                                    <DecessoConiuge>
                                                        <xsl:if test="./GDECC != '' or ./MDECC != '' or ./ADECC != ''">
                                                            <DatadiDecesso>
                                                                <xsl:if test="./GDECC != ''">
                                                                    <Giorno>
                                                                        <xsl:value-of select="./GDECC"/>
                                                                    </Giorno>
                                                                </xsl:if>
                                                                <xsl:if test="./MDECC != ''">
                                                                    <Mese>
                                                                        <xsl:value-of select="./MDECC"/>
                                                                    </Mese>
                                                                </xsl:if>
                                                                <xsl:if test="./ADECC != ''">
                                                                    <Anno>
                                                                        <xsl:value-of select="./ADECC"/>
                                                                    </Anno>
                                                                </xsl:if>
                                                            </DatadiDecesso>
                                                        </xsl:if>
                                                        <xsl:if test="./COMDECC != ''">
                                                            <LuogodiDecesso>
                                                                <NomeComune>
                                                                    <xsl:value-of select="./COMDECC"/>
                                                                </NomeComune>
                                                                <xsl:if test="./PRCDECC != ''">
                                                                    <SiglaProvincia>
                                                                        <xsl:value-of select="./PRCDECC"/>
                                                                    </SiglaProvincia>
                                                                </xsl:if>
                                                                <xsl:if test="./NAZCDECC != ''">
                                                                    <SiglaStato>
                                                                        <xsl:value-of select="./NAZCDECC"/>
                                                                    </SiglaStato>
                                                                </xsl:if>
                                                                <xsl:if test="./DNAZCDECC != ''">
                                                                    <NomeStato>
                                                                        <xsl:value-of select="./DNAZCDECC"/>
                                                                    </NomeStato>
                                                                </xsl:if>
                                                                <xsl:if test="./ICDECC != ''">
                                                                    <CodiceComuneISTAT>
                                                                        <xsl:value-of select="./ICDECC"/>
                                                                    </CodiceComuneISTAT>
                                                                </xsl:if>
                                                                <xsl:if test="./IPRCDECC != ''">
                                                                    <CodiceProvinciaISTAT>
                                                                        <xsl:value-of select="./IPRCDECC"/>
                                                                    </CodiceProvinciaISTAT>
                                                                </xsl:if>
                                                                <xsl:if test="./INAZCDECC != ''">
                                                                    <CodiceStatoISTAT>
                                                                        <xsl:value-of select="./INAZCDECC"/>
                                                                    </CodiceStatoISTAT>
                                                                </xsl:if>
                                                            </LuogodiDecesso>
                                                        </xsl:if>
                                                        <xsl:if test="./NATTDECC != '' or ./PATTDECC != '' or ./SATTDECC != '' or ./AADECC != '' or ./TIPRGDECC !='' or  COMRGDECC !=''">
                                                            <AttodiDecesso>
                                                                <xsl:if test="./TIPRGDECC != ''">
                                                                    <TipoRegistrazione>
                                                                        <xsl:value-of select="./TIPRGDECC"/>
                                                                    </TipoRegistrazione>
                                                                </xsl:if>
                                                                <xsl:if test="./COMRGDECC != ''">
                                                                    <ComuneRegistrazione>
                                                                        <NomeComune>
                                                                            <xsl:value-of select="./COMRGDECC"/>
                                                                        </NomeComune>
                                                                        <xsl:if test="./PRCRGDECC != ''">
                                                                            <SiglaProvincia>
                                                                                <xsl:value-of select="./PRCRGDECC"/>
                                                                            </SiglaProvincia>
                                                                        </xsl:if>
                                                                        <xsl:if test="./NAZCRGDECC != ''">
                                                                            <SiglaStato>
                                                                                <xsl:value-of select="./NAZCRGDECC"/>
                                                                            </SiglaStato>
                                                                        </xsl:if>
                                                                        <xsl:if test="./DNAZCRGDECC != ''">
                                                                            <NomeStato>
                                                                                <xsl:value-of select="./DNAZCRGDECC"/>
                                                                            </NomeStato>
                                                                        </xsl:if>
                                                                        <xsl:if test="./ICRGDECC != ''">
                                                                            <CodiceComuneISTAT>
                                                                                <xsl:value-of select="./ICRGDECC"/>
                                                                            </CodiceComuneISTAT>
                                                                        </xsl:if>
                                                                        <xsl:if test="./IPRCRGDECC != ''">
                                                                            <CodiceProvinciaISTAT>
                                                                                <xsl:value-of select="./IPRCRGDECC"/>
                                                                            </CodiceProvinciaISTAT>
                                                                        </xsl:if>
                                                                        <xsl:if test="./INAZCDECC != ''">
                                                                            <CodiceStatoISTAT>
                                                                                <xsl:value-of select="./INAZCRGDECC"/>
                                                                            </CodiceStatoISTAT>
                                                                        </xsl:if>
                                                                    </ComuneRegistrazione>
                                                                </xsl:if>
                                                                <xsl:if test="./NATTDECC != ''">
                                                                    <Numero>
                                                                        <xsl:value-of select="./NATTDECC"/>
                                                                    </Numero>
                                                                </xsl:if>
                                                                <xsl:if test="./PATTDECC != ''">
                                                                    <Parte>
                                                                        <xsl:value-of select="./PATTDECC"/>
                                                                    </Parte>
                                                                </xsl:if>
                                                                <Serie>
                                                                    <xsl:value-of select="./SATTDECC"/>
                                                                </Serie>
                                                                <xsl:if test="./EATTDECC != ''">
                                                                    <Esponente>
                                                                        <xsl:value-of select="./EATTDECC"/>
                                                                    </Esponente>
                                                                </xsl:if>
                                                                <xsl:if test="./AADECC != ''">
                                                                    <Anno>
                                                                        <xsl:value-of select="./AADECC"/>
                                                                    </Anno>
                                                                </xsl:if>
                                                            </AttodiDecesso>
                                                        </xsl:if>
                                                    </DecessoConiuge>
                                                </xsl:if>
                                            </DatiConiuge>
                                        </xsl:if>
                                        <xsl:if test="./GMAT != '' or ./MMAT != '' or ./AMAT != ''">
                                            <DatadiMatrimonio>
                                                <xsl:if test="./GMAT != ''">
                                                    <Giorno>
                                                        <xsl:value-of select="./GMAT"/>
                                                    </Giorno>
                                                </xsl:if>
                                                <xsl:if test="./MMAT != ''">
                                                    <Mese>
                                                        <xsl:value-of select="./MMAT"/>
                                                    </Mese>
                                                </xsl:if>
                                                <xsl:if test="./AMAT != ''">
                                                    <Anno>
                                                        <xsl:value-of select="./AMAT"/>
                                                    </Anno>
                                                </xsl:if>
                                            </DatadiMatrimonio>
                                        </xsl:if>
                                        <xsl:if test="./COMMAT != ''">
                                            <LuogodiMatrimonio>
                                                <NomeComune>
                                                    <xsl:value-of select="./COMMAT"/>
                                                </NomeComune>
                                                <xsl:if test="./PRCMAT != ''">
                                                    <SiglaProvincia>
                                                        <xsl:value-of select="./PRCMAT"/>
                                                    </SiglaProvincia>
                                                </xsl:if>
                                                <xsl:if test="./NAZCMAT != ''">
                                                    <SiglaStato>
                                                        <xsl:value-of select="./NAZCMAT"/>
                                                    </SiglaStato>
                                                </xsl:if>
                                                <xsl:if test="./DNAZCMAT != ''">
                                                    <NomeStato>
                                                        <xsl:value-of select="./DNAZCMAT"/>
                                                    </NomeStato>
                                                </xsl:if>
                                                <xsl:if test="./ICMAT != ''">
                                                    <CodiceComuneISTAT>
                                                        <xsl:value-of select="./ICMAT"/>
                                                    </CodiceComuneISTAT>
                                                </xsl:if>
                                                <xsl:if test="./IPRCMAT != ''">
                                                    <CodiceProvinciaISTAT>
                                                        <xsl:value-of select="./IPRCMAT"/>
                                                    </CodiceProvinciaISTAT>
                                                </xsl:if>
                                                <xsl:if test="./INAZCMAT != ''">
                                                    <CodiceStatoISTAT>
                                                        <xsl:value-of select="./INAZCMAT"/>
                                                    </CodiceStatoISTAT>
                                                </xsl:if>
                                            </LuogodiMatrimonio>
                                        </xsl:if>
                                        <xsl:if test="./NATTMAT != '' or ./PATTMAT != '' or ./SATTMAT != '' or ./AAMAT != '' or ./TIPRGMAT !='' or ./COMRGMAT !=''">
                                            <AttodiMatrimonio>
                                                <xsl:if test="./TIPRGMAT != ''">
                                                    <TipoRegistrazione>
                                                        <xsl:value-of select="./TIPRGMAT"/>
                                                    </TipoRegistrazione>
                                                </xsl:if>
                                                <xsl:if test="./COMRGMAT != ''">
                                                    <ComuneRegistrazione>
                                                        <NomeComune>
                                                            <xsl:value-of select="./COMRGMAT"/>
                                                        </NomeComune>
                                                        <xsl:if test="./PRCRGMAT != ''">
                                                            <SiglaProvincia>
                                                                <xsl:value-of select="./PRCRGMAT"/>
                                                            </SiglaProvincia>
                                                        </xsl:if>
                                                        <xsl:if test="./NAZCRGMAT != ''">
                                                            <SiglaStato>
                                                                <xsl:value-of select="./NAZCRGMAT"/>
                                                            </SiglaStato>
                                                        </xsl:if>
                                                        <xsl:if test="./DNAZCRGMAT != ''">
                                                            <NomeStato>
                                                                <xsl:value-of select="./DNAZCRGMAT"/>
                                                            </NomeStato>
                                                        </xsl:if>
                                                        <xsl:if test="./ICRGMAT != ''">
                                                            <CodiceComuneISTAT>
                                                                <xsl:value-of select="./ICRGMAT"/>
                                                            </CodiceComuneISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./IPRCRGMAT != ''">
                                                            <CodiceProvinciaISTAT>
                                                                <xsl:value-of select="./IPRCRGMAT"/>
                                                            </CodiceProvinciaISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./INAZCMAT != ''">
                                                            <CodiceStatoISTAT>
                                                                <xsl:value-of select="./INAZCRGMAT"/>
                                                            </CodiceStatoISTAT>
                                                        </xsl:if>
                                                    </ComuneRegistrazione>
                                                </xsl:if>
                                                <xsl:if test="./NATTMAT != ''">
                                                    <Numero>
                                                        <xsl:value-of select="./NATTMAT"/>
                                                    </Numero>
                                                </xsl:if>
                                                <xsl:if test="./PATTMAT != ''">
                                                    <Parte>
                                                        <xsl:value-of select="./PATTMAT"/>
                                                    </Parte>
                                                </xsl:if>
                                                <Serie>
                                                    <xsl:value-of select="./SATTMAT"/>
                                                </Serie>
                                                <xsl:if test="./EATTMAT != ''">
                                                    <Esponente>
                                                        <xsl:value-of select="./EATTMAT"/>
                                                    </Esponente>
                                                </xsl:if>
                                                <xsl:if test="./AAMAT != ''">
                                                    <Anno>
                                                        <xsl:value-of select="./AAMAT"/>
                                                    </Anno>
                                                </xsl:if>
                                            </AttodiMatrimonio>
                                        </xsl:if>
                                    </Matrimonio>
                                </xsl:if>
                                <xsl:if test="./GDEC != '' or ./MDEC != '' or ./ADEC != '' or ./COMDEC != ''  or ./NATTDEC != '' or ./PATTDEC != '' or ./SATTDEC != '' or ./AADEC != '' or ./TIPRGDEC != '' or ./COMRGDEC != ''">
                                    <Decesso>
                                        <xsl:if test="./GDEC != '' or ./MDEC != '' or ./ADEC != ''">
                                            <DatadiDecesso>
                                                <xsl:if test="./GDEC != ''">
                                                    <Giorno>
                                                        <xsl:value-of select="./GDEC"/>
                                                    </Giorno>
                                                </xsl:if>
                                                <xsl:if test="./MDEC != ''">
                                                    <Mese>
                                                        <xsl:value-of select="./MDEC"/>
                                                    </Mese>
                                                </xsl:if>
                                                <xsl:if test="./ADEC != ''">
                                                    <Anno>
                                                        <xsl:value-of select="./ADEC"/>
                                                    </Anno>
                                                </xsl:if>
                                            </DatadiDecesso>
                                        </xsl:if>
                                        <xsl:if test="./COMDEC != ''">
                                            <LuogodiDecesso>
                                                <NomeComune>
                                                    <xsl:value-of select="./COMDEC"/>
                                                </NomeComune>
                                                <xsl:if test="./PRCDEC != ''">
                                                    <SiglaProvincia>
                                                        <xsl:value-of select="./PRCDEC"/>
                                                    </SiglaProvincia>
                                                </xsl:if>
                                                <xsl:if test="./NAZCDEC != ''">
                                                    <SiglaStato>
                                                        <xsl:value-of select="./NAZCDEC"/>
                                                    </SiglaStato>
                                                </xsl:if>
                                                <xsl:if test="./DNAZCDEC != ''">
                                                    <NomeStato>
                                                        <xsl:value-of select="./DNAZCDEC"/>
                                                    </NomeStato>
                                                </xsl:if>
                                                <xsl:if test="./ICDEC != ''">
                                                    <CodiceComuneISTAT>
                                                        <xsl:value-of select="./ICDEC"/>
                                                    </CodiceComuneISTAT>
                                                </xsl:if>
                                                <xsl:if test="./IPRCDEC != ''">
                                                    <CodiceProvinciaISTAT>
                                                        <xsl:value-of select="./IPRCDEC"/>
                                                    </CodiceProvinciaISTAT>
                                                </xsl:if>
                                                <xsl:if test="./INAZCDEC != ''">
                                                    <CodiceStatoISTAT>
                                                        <xsl:value-of select="./INAZCDEC"/>
                                                    </CodiceStatoISTAT>
                                                </xsl:if>
                                            </LuogodiDecesso>
                                        </xsl:if>
                                        <xsl:if test="./NATTDEC != '' or ./PATTDEC != '' or ./SATTDEC != '' or ./AADEC != '' or ./TIPRGDEC != '' or ./COMRGDEC != ''">
                                            <AttodiDecesso>
                                                <xsl:if test="./TIPRGDEC != ''">
                                                    <TipoRegistrazione>
                                                        <xsl:value-of select="./TIPRGDEC"/>
                                                    </TipoRegistrazione>
                                                </xsl:if>
                                                <xsl:if test="./COMRGDEC != ''">
                                                    <ComuneRegistrazione>
                                                        <NomeComune>
                                                            <xsl:value-of select="./COMRGDEC"/>
                                                        </NomeComune>
                                                        <xsl:if test="./PRCRGDEC != ''">
                                                            <SiglaProvincia>
                                                                <xsl:value-of select="./PRCRGDEC"/>
                                                            </SiglaProvincia>
                                                        </xsl:if>
                                                        <xsl:if test="./NAZCRGDEC != ''">
                                                            <SiglaStato>
                                                                <xsl:value-of select="./NAZCRGDEC"/>
                                                            </SiglaStato>
                                                        </xsl:if>
                                                        <xsl:if test="./DNAZCRGDEC != ''">
                                                            <NomeStato>
                                                                <xsl:value-of select="./DNAZCRGDEC"/>
                                                            </NomeStato>
                                                        </xsl:if>
                                                        <xsl:if test="./ICRGDEC != ''">
                                                            <CodiceComuneISTAT>
                                                                <xsl:value-of select="./ICRGDEC"/>
                                                            </CodiceComuneISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./IPRCRGDEC != ''">
                                                            <CodiceProvinciaISTAT>
                                                                <xsl:value-of select="./IPRCRGDEC"/>
                                                            </CodiceProvinciaISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./INAZCDEC != ''">
                                                            <CodiceStatoISTAT>
                                                                <xsl:value-of select="./INAZCRGDEC"/>
                                                            </CodiceStatoISTAT>
                                                        </xsl:if>
                                                    </ComuneRegistrazione>
                                                </xsl:if>
                                                <xsl:if test="./NATTDEC != ''">
                                                    <Numero>
                                                        <xsl:value-of select="./NATTDEC"/>
                                                    </Numero>
                                                </xsl:if>
                                                <xsl:if test="./PATTDEC != ''">
                                                    <Parte>
                                                        <xsl:value-of select="./PATTDEC"/>
                                                    </Parte>
                                                </xsl:if>
                                                <Serie>
                                                    <xsl:value-of select="./SATTDEC"/>
                                                </Serie>
                                                <xsl:if test="./EATTDEC != ''">
                                                    <Esponente>
                                                        <xsl:value-of select="./EATTDEC"/>
                                                    </Esponente>
                                                </xsl:if>
                                                <xsl:if test="./AADEC != ''">
                                                    <Anno>
                                                        <xsl:value-of select="./AADEC"/>
                                                    </Anno>
                                                </xsl:if>
                                            </AttodiDecesso>
                                        </xsl:if>
                                        <xsl:if test="./COMRESDEC != ''">
                                            <ResidenzaAllaDataDecesso>
                                                <NomeComune>
                                                    <xsl:value-of select="./COMRESDEC"/>
                                                </NomeComune>
                                            </ResidenzaAllaDataDecesso>
                                        </xsl:if>
                                        <xsl:if test="./DECPRE != ''">
                                            <FlagDecessoPresunto>
                                                <xsl:value-of select="./DECPRE"/>
                                            </FlagDecessoPresunto>
                                        </xsl:if>
                                    </Decesso>
                                </xsl:if>
                                <xsl:if test="./COMPRO != '' or ./GRES != '' or ./MRES != '' or ./ARES != '' or ./MOTISC !='' or ./PROTIMM != '' or ./APROTIMM != '' or ./GEMI != '' or ./MEMI != '' or ./AEMI != '' or ./COMEMI != '' or ./FIRR != '' or ./GIRR != '' or ./MIRR != '' or ./AIRR != '' or ./ATTCAN != '' or ./GAIRE != '' or ./MAIRE != '' or ./AIRE != '' or ./COMAIRE != '' or ./ISCPRO1 != '' or ./ISCPRO2 != '' or ./APROTAIRE != '' or ./PROTAIRE != '' or ./ARIFAIRE != '' or ./ISCCAN != '' or ./RESID != '' or ./CODAIRE != '' or ./ANNOTAIRE1 != '' or ./ANNOTAIRE2 != '' or ./MOTAIRE != '' or  ./ARIF != '' or ./GRIE != '' or ./MRIE != '' or ./ARIE != '' or ./COMRIE != ''">
                                    <SituazioneAnagrafe>
                                        <xsl:if test="./COMPRO != '' or ./PROTIMM != '' or ./APROTIMM != '' or ./GRES != '' or ./MRES != '' or ./ARES != ''">
                                            <Iscrizione>
                                                <xsl:if test="./GRES != '' or ./MRES != '' or ./ARES != ''">
                                                    <xsl:if test="./MOTISC !=''">
                                                        <MotivodiIscrizione>
                                                            <xsl:value-of select="./MOTISC"/>
                                                        </MotivodiIscrizione>
                                                    </xsl:if>
                                                    <DatadiIscrizione>
                                                        <xsl:if test="./GRES != ''">
                                                            <Giorno>
                                                                <xsl:value-of select="./GRES"/>
                                                            </Giorno>
                                                        </xsl:if>
                                                        <xsl:if test="./MRES != ''">
                                                            <Mese>
                                                                <xsl:value-of select="./MRES"/>
                                                            </Mese>
                                                        </xsl:if>
                                                        <xsl:if test="./ARES != ''">
                                                            <Anno>
                                                                <xsl:value-of select="./ARES"/>
                                                            </Anno>
                                                        </xsl:if>
                                                    </DatadiIscrizione>
                                                </xsl:if>
                                                <xsl:if test="./COMPRO != ''">
                                                    <ComunediProvenienza>
                                                        <NomeComune>
                                                            <xsl:value-of select="./COMPRO"/>
                                                        </NomeComune>
                                                        <xsl:if test="./PRCPRO != ''">
                                                            <SiglaProvincia>
                                                                <xsl:value-of select="./PRCPRO"/>
                                                            </SiglaProvincia>
                                                        </xsl:if>
                                                        <xsl:if test="./NAZCPRO != ''">
                                                            <SiglaStato>
                                                                <xsl:value-of select="./NAZCPRO"/>
                                                            </SiglaStato>
                                                        </xsl:if>
                                                        <xsl:if test="./DNAZCPRO != ''">
                                                            <NomeStato>
                                                                <xsl:value-of select="./DNAZCPRO"/>
                                                            </NomeStato>
                                                        </xsl:if>
                                                        <xsl:if test="./ICPRO != ''">
                                                            <CodiceComuneISTAT>
                                                                <xsl:value-of select="./ICPRO"/>
                                                            </CodiceComuneISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./IPRCPRO != ''">
                                                            <CodiceProvinciaISTAT>
                                                                <xsl:value-of select="./IPRCPRO"/>
                                                            </CodiceProvinciaISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./INAZCPRO != ''">
                                                            <CodiceStatoISTAT>
                                                                <xsl:value-of select="./INAZCPRO"/>
                                                            </CodiceStatoISTAT>
                                                        </xsl:if>
                                                    </ComunediProvenienza>
                                                </xsl:if>
                                                <xsl:if test="./PROTIMM != ''">
                                                    <ProtocolloIscrizione>
                                                        <NumeroProtocollo>
                                                            <xsl:value-of select="./PROTIMM"/>
                                                        </NumeroProtocollo>
                                                        <xsl:if test="./APROTIMM != ''">
                                                            <AnnoProtocollo>
                                                                <xsl:value-of select="./APROTIMM"/>
                                                            </AnnoProtocollo>
                                                        </xsl:if>
                                                    </ProtocolloIscrizione>
                                                </xsl:if>
                                            </Iscrizione>
                                        </xsl:if>
                                        <xsl:if test="./GEMI != '' or ./MEMI != '' or ./AEMI != '' or ./COMEMI != '' or ./GIRR != '' or ./MIRR != '' or ./AIRR != ''">
                                            <Cancellazione>
                                                <xsl:choose>
                                                    <xsl:when test="./GIRR != '' or ./MIRR != '' or ./AIRR != ''">
                                                        <DatadiCancellazione>
                                                            <xsl:if test="./GIRR != ''">
                                                                <Giorno>
                                                                    <xsl:value-of select="./GIRR"/>
                                                                </Giorno>
                                                            </xsl:if>
                                                            <xsl:if test="./MIRR != ''">
                                                                <Mese>
                                                                    <xsl:value-of select="./MIRR"/>
                                                                </Mese>
                                                            </xsl:if>
                                                            <xsl:if test="./AIRR != ''">
                                                                <Anno>
                                                                    <xsl:value-of select="./AIRR"/>
                                                                </Anno>
                                                            </xsl:if>
                                                        </DatadiCancellazione>
                                                        <MotivodiCancellazione>
                                                            <xsl:choose>
                                                                <xsl:when test="./MOTCAN != ''">
                                                                    <xsl:value-of select="./MOTCAN"/>
                                                                </xsl:when>
                                                                <xsl:otherwise>Irreperibilità</xsl:otherwise>
                                                            </xsl:choose>
                                                        </MotivodiCancellazione>
                                                        <xsl:if test="./NPROIRR != '' or ./APROIRR != ''">
                                                            <ProtocolloCancellazione>
                                                                <xsl:if test="./NPROIRR != ''">
                                                                    <NumeroProtocollo>
                                                                        <xsl:value-of select="./NPROIRR"/>
                                                                    </NumeroProtocollo>
                                                                </xsl:if>
                                                                <xsl:if test="./APROIRR != ''">
                                                                    <AnnoProtocollo>
                                                                        <xsl:value-of select="./APROIRR"/>
                                                                    </AnnoProtocollo>
                                                                </xsl:if>
                                                            </ProtocolloCancellazione>
                                                        </xsl:if>
                                                    </xsl:when>
                                                    <xsl:otherwise>
                                                        <xsl:if test="./GEMI != '' or ./MEMI != '' or ./AEMI != '' or ./COMEMI !=''">
                                                            <DatadiCancellazione>
                                                                <xsl:if test="./GEMI != ''">
                                                                    <Giorno>
                                                                        <xsl:value-of select="./GEMI"/>
                                                                    </Giorno>
                                                                </xsl:if>
                                                                <xsl:if test="./MEMI != ''">
                                                                    <Mese>
                                                                        <xsl:value-of select="./MEMI"/>
                                                                    </Mese>
                                                                </xsl:if>
                                                                <xsl:if test="./AEMI != ''">
                                                                    <Anno>
                                                                        <xsl:value-of select="./AEMI"/>
                                                                    </Anno>
                                                                </xsl:if>
                                                            </DatadiCancellazione>
                                                        </xsl:if>
                                                        <xsl:if test="./MOTCAN != ''">
                                                            <MotivodiCancellazione>
                                                                <xsl:value-of select="./MOTCAN"/>
                                                            </MotivodiCancellazione>
                                                        </xsl:if>
                                                        <xsl:if test="./COMEMI != ''">
                                                            <ComunediDestinazione>
                                                                <NomeComune>
                                                                    <xsl:value-of select="./COMEMI"/>
                                                                </NomeComune>
                                                                <xsl:if test="./PRCEMI != ''">
                                                                    <SiglaProvincia>
                                                                        <xsl:value-of select="./PRCEMI"/>
                                                                    </SiglaProvincia>
                                                                </xsl:if>
                                                                <xsl:if test="./NAZCEMI != ''">
                                                                    <SiglaStato>
                                                                        <xsl:value-of select="./NAZCEMI"/>
                                                                    </SiglaStato>
                                                                </xsl:if>
                                                                <xsl:if test="./DNAZCEMI != ''">
                                                                    <NomeStato>
                                                                        <xsl:value-of select="./DNAZCEMI"/>
                                                                    </NomeStato>
                                                                </xsl:if>
                                                                <xsl:if test="./ICEMI != ''">
                                                                    <CodiceComuneISTAT>
                                                                        <xsl:value-of select="./ICEMI"/>
                                                                    </CodiceComuneISTAT>
                                                                </xsl:if>
                                                                <xsl:if test="./IPRCEMI != ''">
                                                                    <CodiceProvinciaISTAT>
                                                                        <xsl:value-of select="./IPRCEMI"/>
                                                                    </CodiceProvinciaISTAT>
                                                                </xsl:if>
                                                                <xsl:if test="./INAZCEMI != ''">
                                                                    <CodiceStatoISTAT>
                                                                        <xsl:value-of select="./INAZCEMI"/>
                                                                    </CodiceStatoISTAT>
                                                                </xsl:if>
                                                            </ComunediDestinazione>
                                                        </xsl:if>
                                                        <xsl:if test="./PROTEMI != '' or ./APROTEMI != ''">
                                                            <ProtocolloCancellazione>
                                                                <xsl:if test="./PROTEMI != ''">
                                                                    <NumeroProtocollo>
                                                                        <xsl:value-of select="./PROTEMI"/>
                                                                    </NumeroProtocollo>
                                                                    <xsl:if test="./APROTEMI != ''">
                                                                        <AnnoProtocollo>
                                                                            <xsl:value-of select="./APROTEMI"/>
                                                                        </AnnoProtocollo>
                                                                    </xsl:if>
                                                                    <xsl:if test="./ARIF != ''">
                                                                        <AnnoRiferimento>
                                                                            <xsl:value-of select="./ARIF"/>
                                                                        </AnnoRiferimento>
                                                                    </xsl:if>
                                                                </xsl:if>
                                                            </ProtocolloCancellazione>
                                                        </xsl:if>
                                                    </xsl:otherwise>
                                                </xsl:choose>
                                            </Cancellazione>
                                        </xsl:if>
                                        <xsl:if test=" ./GAIRE != '' or ./MAIRE != '' or ./AIRE != '' or ./COMAIRE != '' or ./ISCPRO1 != '' or ./ISCPRO2 != '' or ./APROTAIRE != '' or ./PROTAIRE != '' or ./ARIFAIRE != '' or ./ISCCAN != '' or ./RESID != '' or ./CODAIRE != '' or ./ANNOTAIRE1 != '' or ./ANNOTAIRE2 != '' or ./MOTAIRE != '' or  ./ARIF != '' or ./GRIE != '' or ./MRIE != '' or ./ARIE != '' or ./COMRIE != ''">
                                            <DatiAIRE>
                                                <xsl:if test="./CODAIRE != ''">
                                                    <CodiceAIRE>
                                                        <xsl:value-of select="./CODAIRE"/>
                                                    </CodiceAIRE>
                                                </xsl:if>
                                                <xsl:if test="./GAIRE != '' or ./MAIRE != '' or ./AIRE != ''">
                                                    <DataIscrizioneAIRE>
                                                        <xsl:if test="./GAIRE != ''">
                                                            <Giorno>
                                                                <xsl:value-of select="./GAIRE"/>
                                                            </Giorno>
                                                        </xsl:if>
                                                        <xsl:if test="./MAIRE != ''">
                                                            <Mese>
                                                                <xsl:value-of select="./MAIRE"/>
                                                            </Mese>
                                                        </xsl:if>
                                                        <xsl:if test="./AAIRE != ''">
                                                            <Anno>
                                                                <xsl:value-of select="./AAIRE"/>
                                                            </Anno>
                                                        </xsl:if>
                                                    </DataIscrizioneAIRE>
                                                </xsl:if>
                                                <xsl:if test="./COMAIRE != ''">
                                                    <ComuneIscrizioneAIRE>
                                                        <NomeComune>
                                                            <xsl:value-of select="./COMAIRE"/>
                                                        </NomeComune>
                                                        <xsl:if test="./PRCAIRE != ''">
                                                            <SiglaProvincia>
                                                                <xsl:value-of select="./PRCAIRE"/>
                                                            </SiglaProvincia>
                                                        </xsl:if>
                                                        <xsl:if test="./NAZCAIRE != ''">
                                                            <SiglaStato>
                                                                <xsl:value-of select="./NAZCAIRE"/>
                                                            </SiglaStato>
                                                        </xsl:if>
                                                        <xsl:if test="./DNAZCAIRE != ''">
                                                            <NomeStato>
                                                                <xsl:value-of select="./DNAZCAIRE"/>
                                                            </NomeStato>
                                                        </xsl:if>
                                                        <xsl:if test="./ICAIRE != ''">
                                                            <CodiceComuneISTAT>
                                                                <xsl:value-of select="./ICAIRE"/>
                                                            </CodiceComuneISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./IPRCAIRE != ''">
                                                            <CodiceProvinciaISTAT>
                                                                <xsl:value-of select="./IPRCAIRE"/>
                                                            </CodiceProvinciaISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./INAZCAIRE != ''">
                                                            <CodiceStatoISTAT>
                                                                <xsl:value-of select="./INAZCAIRE"/>
                                                            </CodiceStatoISTAT>
                                                        </xsl:if>
                                                    </ComuneIscrizioneAIRE>
                                                </xsl:if>
                                                <xsl:if test="./PROTAIRE != ''">
                                                    <ProtocolloAIRE>
                                                        <NumeroProtocollo>
                                                            <xsl:value-of select="./PROTAIRE"/>
                                                        </NumeroProtocollo>
                                                        <xsl:if test="./APROTAIRE != ''">
                                                            <AnnoProtocollo>
                                                                <xsl:value-of select="./APROTAIRE"/>
                                                            </AnnoProtocollo>
                                                        </xsl:if>
                                                        <xsl:if test="./ARIFAIRE != ''">
                                                            <AnnoRiferimento>
                                                                <xsl:value-of select="./ARIFAIRE"/>
                                                            </AnnoRiferimento>
                                                        </xsl:if>
                                                    </ProtocolloAIRE>
                                                </xsl:if>
                                                <xsl:if test="CAPAIRE != ''">
                                                    <CAPAIRE>
                                                        <xsl:value-of select="./CAPAIRE"/>
                                                    </CAPAIRE>
                                                </xsl:if>
                                                <xsl:if test="./UFFCONS != ''">
                                                    <Consolato>
                                                        <CodiceConsolato>
                                                            <xsl:value-of select="./UFFCONS"/>
                                                        </CodiceConsolato>
                                                        <xsl:if test="./DESCONS != ''">
                                                            <DenominazioneConsolato>
                                                                <xsl:value-of select="./DESCONS"/>
                                                            </DenominazioneConsolato>
                                                        </xsl:if>
                                                    </Consolato>
                                                </xsl:if>
                                                <xsl:if test="./GRIE != '' or ./MRIE != '' or ./ARIE != ''">
                                                    <DataRientro>
                                                        <xsl:if test="./GRIE != ''">
                                                            <Giorno>
                                                                <xsl:value-of select="./GRIE"/>
                                                            </Giorno>
                                                        </xsl:if>
                                                        <xsl:if test="./MRIE != ''">
                                                            <Mese>
                                                                <xsl:value-of select="./MRIE"/>
                                                            </Mese>
                                                        </xsl:if>
                                                        <xsl:if test="./ARIE != ''">
                                                            <Anno>
                                                                <xsl:value-of select="./ARIE"/>
                                                            </Anno>
                                                        </xsl:if>
                                                    </DataRientro>
                                                </xsl:if>
                                                <xsl:if test="./COMRIE != ''">
                                                    <ComuneRientro>
                                                        <NomeComune>
                                                            <xsl:value-of select="./COMRIE"/>
                                                        </NomeComune>
                                                        <xsl:if test="./PRCRIE != ''">
                                                            <SiglaProvincia>
                                                                <xsl:value-of select="./PRCRIE"/>
                                                            </SiglaProvincia>
                                                        </xsl:if>
                                                        <xsl:if test="./NAZCRIE != ''">
                                                            <SiglaStato>
                                                                <xsl:value-of select="./NAZCRIE"/>
                                                            </SiglaStato>
                                                        </xsl:if>
                                                        <xsl:if test="./DNAZCRIE != ''">
                                                            <NomeStato>
                                                                <xsl:value-of select="./DNAZCRIE"/>
                                                            </NomeStato>
                                                        </xsl:if>
                                                        <xsl:if test="./ICRIE != ''">
                                                            <CodiceComuneISTAT>
                                                                <xsl:value-of select="./ICRIE"/>
                                                            </CodiceComuneISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./IPRCRIE != ''">
                                                            <CodiceProvinciaISTAT>
                                                                <xsl:value-of select="./IPRCRIE"/>
                                                            </CodiceProvinciaISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./INAZCRIE != ''">
                                                            <CodiceStatoISTAT>
                                                                <xsl:value-of select="./INAZCRIE"/>
                                                            </CodiceStatoISTAT>
                                                        </xsl:if>
                                                    </ComuneRientro>
                                                </xsl:if>
                                                <xsl:if test="./OPEAIR != '' or ./MOTAIRE != ''">
                                                    <MovimentoAIRE>
                                                        <xsl:if test="./OPEAIR != ''">
                                                            <TipoMovimentoAIRE>
                                                                <xsl:value-of select="./OPEAIR"/>
                                                            </TipoMovimentoAIRE>
                                                        </xsl:if>
                                                        <xsl:if test="./MOTAIRE != ''">
                                                            <MotivoMovimentoAIRE>
                                                                <xsl:value-of select="./MOTAIRE"/>
                                                            </MotivoMovimentoAIRE>
                                                        </xsl:if>
                                                    </MovimentoAIRE>
                                                </xsl:if>
                                                <xsl:if test="./ANNOTAIRE1 != '' or ./ANNOTAIRE2 != ''">
                                                    <AnnotazioniAIRE>
                                                        <xsl:value-of select="./ANNOTAIRE1"/>
                                                        <xsl:value-of select="./ANNOTAIRE2"/>
                                                    </AnnotazioniAIRE>
                                                </xsl:if>
                                            </DatiAIRE>
                                        </xsl:if>
                                        <xsl:if test="./ATTCAN = '1'">
                                            <IrreperibilitaInCorso>
                                                <FlagIrreperibilitaInCorso>
                                                    <xsl:value-of select="./ATTCAN"/>
                                                </FlagIrreperibilitaInCorso>
                                                <xsl:if test="./NPROIRR != ''">
                                                    <ProtocolloIrreperibilita>
                                                        <NumeroProtocollo>
                                                            <xsl:value-of select="./NPROIRR"/>
                                                        </NumeroProtocollo>
                                                        <xsl:if test="./APROIRR != ''">
                                                            <AnnoProtocollo>
                                                                <xsl:value-of select="./APROIRR"/>
                                                            </AnnoProtocollo>
                                                        </xsl:if>
                                                    </ProtocolloIrreperibilita>
                                                </xsl:if>
                                            </IrreperibilitaInCorso>
                                        </xsl:if>
                                        <xsl:if test="./ATTCAN = '3'">
                                            <IrreperibilitaCensimento>S</IrreperibilitaCensimento>
                                        </xsl:if>
                                        <xsl:if test="./ATTCAN != '3'">
                                            <IrreperibilitaCensimento>N</IrreperibilitaCensimento>
                                        </xsl:if>
                                    </SituazioneAnagrafe>
                                </xsl:if>
                                <xsl:if test="count(./CARTAID) > 0 or count(./OSTATIVA) > 0 or count(./LIBRETTO) > 0 or count(./PENSIONE) > 0 or /TIPSOG != '' or ./NUMSOG != '' or ./QUESOG != '' or ./GRILSOG != '' or ./MRILSOG != '' or ./ARILSOG != '' or ./GRINSOG != '' or ./MRINSOG != ''or ./ARINSOG != 	''or ./GSCASOG != ''or ./MSCASOG != ''or ./ASCASOG != ''">
                                    <Documenti>
                                        <xsl:if test="count(./CARTAID) > 0 or count(./OSTATIVA) > 0">
                                            <CartaIdentita>
                                                <xsl:for-each select="./CARTAID">
                                                    <DatiCartaIdentita>
                                                        <xsl:if test="./ULTCARTA != ''">
                                                            <UltimaCI>
                                                                <xsl:value-of select="./ULTCARTA"/>
                                                            </UltimaCI>
                                                        </xsl:if>
                                                        <xsl:if test="./NUMCARTA != ''">
                                                            <NumeroCI>
                                                                <xsl:value-of select="./NUMCARTA"/>
                                                            </NumeroCI>
                                                        </xsl:if>
                                                        <xsl:if test="./ELETTRO != ''">
                                                            <CIE>
                                                                <xsl:value-of select="./ELETTRO"/>
                                                            </CIE>
                                                        </xsl:if>
                                                        <xsl:if test="./GRIL != '' or ./MRIL != '' or ./ARIL != ''">
                                                            <DataRilascioCI>
                                                                <xsl:if test="./GRIL != ''">
                                                                    <Giorno>
                                                                        <xsl:value-of select="./GRIL"/>
                                                                    </Giorno>
                                                                </xsl:if>
                                                                <xsl:if test="./MRIL != ''">
                                                                    <Mese>
                                                                        <xsl:value-of select="./MRIL"/>
                                                                    </Mese>
                                                                </xsl:if>
                                                                <xsl:if test="./ARIL != ''">
                                                                    <Anno>
                                                                        <xsl:value-of select="./ARIL"/>
                                                                    </Anno>
                                                                </xsl:if>
                                                            </DataRilascioCI>
                                                        </xsl:if>
                                                        <xsl:if test="./COMRIL != ''">
                                                            <ComuneRilascioCI>
                                                                <NomeComune>
                                                                    <xsl:value-of select="./COMRIL"/>
                                                                </NomeComune>
                                                                <xsl:if test="./PRCRIL != ''">
                                                                    <SiglaProvincia>
                                                                        <xsl:value-of select="./PRCRIL"/>
                                                                    </SiglaProvincia>
                                                                </xsl:if>
                                                                <xsl:if test="./NAZCRIL != ''">
                                                                    <SiglaStato>
                                                                        <xsl:value-of select="./NAZCRIL"/>
                                                                    </SiglaStato>
                                                                </xsl:if>
                                                                <xsl:if test="./DNAZCRIL != ''">
                                                                    <NomeStato>
                                                                        <xsl:value-of select="./DNAZCRIL"/>
                                                                    </NomeStato>
                                                                </xsl:if>
                                                                <xsl:if test="./ICRIL != ''">
                                                                    <CodiceComuneISTAT>
                                                                        <xsl:value-of select="./ICRIL"/>
                                                                    </CodiceComuneISTAT>
                                                                </xsl:if>
                                                                <xsl:if test="./IPRCRIL != ''">
                                                                    <CodiceProvinciaISTAT>
                                                                        <xsl:value-of select="./IPRCRIL"/>
                                                                    </CodiceProvinciaISTAT>
                                                                </xsl:if>
                                                                <xsl:if test="./INAZCRIL != ''">
                                                                    <CodiceStatoISTAT>
                                                                        <xsl:value-of select="./INAZCRIL"/>
                                                                    </CodiceStatoISTAT>
                                                                </xsl:if>
                                                            </ComuneRilascioCI>
                                                        </xsl:if>
                                                        <xsl:if test="./TIPCAR != ''">
                                                            <TipoCI>
                                                                <xsl:value-of select="./TIPCAR"/>
                                                            </TipoCI>
                                                        </xsl:if>
                                                        <xsl:if test="./DESCARTA != ''">
                                                            <DescrizioneCI>
                                                                <xsl:value-of select="./DESCARTA"/>
                                                            </DescrizioneCI>
                                                        </xsl:if>
                                                        <xsl:if test="./MUNCID != ''">
                                                            <MunicipioRilascioCI>
                                                                <xsl:value-of select="./MUNCID"/>
                                                            </MunicipioRilascioCI>
                                                        </xsl:if>
                                                    </DatiCartaIdentita>
                                                </xsl:for-each>
                                                <xsl:if test="./OSTATIVA != ''">
                                                    <OstativaRilascioCI>
                                                        <xsl:value-of select="./OSTATIVA"/>
                                                    </OstativaRilascioCI>
                                                </xsl:if>
                                            </CartaIdentita>
                                        </xsl:if>
                                        <xsl:if test="./TIPSOG != '' or ./NUMSOG != '' or ./QUESOG != '' or ./GRILSOG != '' or ./MRILSOG != '' or ./ARILSOG != '' or ./GRINSOG != '' or ./MRINSOG != ''or 	./ARINSOG != 	''or ./GSCASOG != ''or ./MSCASOG != ''or ./ASCASOG != ''">
                                            <PermessoSoggiorno>
                                                <xsl:if test="./NUMSOG != ''">
                                                    <NumeroPermesso>
                                                        <xsl:value-of select="./NUMSOG"/>
                                                    </NumeroPermesso>
                                                </xsl:if>
                                                <xsl:if test="./TIPSOG != ''">
                                                    <TipoPermesso>
                                                        <xsl:value-of select="./TIPSOG"/>
                                                    </TipoPermesso>
                                                </xsl:if>
                                                <xsl:if test="./QUESOG != ''">
                                                    <Questura>
                                                        <NomeComune>
                                                            <xsl:value-of select="./QUESOG"/>
                                                        </NomeComune>
                                                        <xsl:if test="./PRCQUE != ''">
                                                            <SiglaProvincia>
                                                                <xsl:value-of select="./PRCQUE"/>
                                                            </SiglaProvincia>
                                                        </xsl:if>
                                                        <xsl:if test="./NAZCQUE != ''">
                                                            <SiglaStato>
                                                                <xsl:value-of select="./NAZCQUE"/>
                                                            </SiglaStato>
                                                        </xsl:if>
                                                        <xsl:if test="./DNAZCQUE != ''">
                                                            <NomeStato>
                                                                <xsl:value-of select="./DNAZCQUE"/>
                                                            </NomeStato>
                                                        </xsl:if>
                                                        <xsl:if test="./ICQUE != ''">
                                                            <CodiceComuneISTAT>
                                                                <xsl:value-of select="./ICQUE"/>
                                                            </CodiceComuneISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./IPRCQUE != ''">
                                                            <CodiceProvinciaISTAT>
                                                                <xsl:value-of select="./IPRCQUE"/>
                                                            </CodiceProvinciaISTAT>
                                                        </xsl:if>
                                                        <xsl:if test="./INAZCQUE != ''">
                                                            <CodiceStatoISTAT>
                                                                <xsl:value-of select="./INAZCQUE"/>
                                                            </CodiceStatoISTAT>
                                                        </xsl:if>
                                                    </Questura>
                                                </xsl:if>
                                                <xsl:if test="./GRILSOG != '' or ./MRILSOG != '' or ./ARILSOG != ''">
                                                    <DataRilascioPermesso>
                                                        <xsl:if test="./GRILSOG != ''">
                                                            <Giorno>
                                                                <xsl:value-of select="./GRILSOG"/>
                                                            </Giorno>
                                                        </xsl:if>
                                                        <xsl:if test="./MRILSOG != ''">
                                                            <Mese>
                                                                <xsl:value-of select="./MRILSOG"/>
                                                            </Mese>
                                                        </xsl:if>
                                                        <xsl:if test="./ARILSOG != ''">
                                                            <Anno>
                                                                <xsl:value-of select="./ARILSOG"/>
                                                            </Anno>
                                                        </xsl:if>
                                                    </DataRilascioPermesso>
                                                </xsl:if>
                                                <xsl:if test="./GRINSOG != '' or ./MRINSOG != '' or ./ARINSOG != ''">
                                                    <DataRinnovoPermesso>
                                                        <xsl:if test="./GRINSOG != ''">
                                                            <Giorno>
                                                                <xsl:value-of select="./GRINSOG"/>
                                                            </Giorno>
                                                        </xsl:if>
                                                        <xsl:if test="./MRINSOG != ''">
                                                            <Mese>
                                                                <xsl:value-of select="./MRINSOG"/>
                                                            </Mese>
                                                        </xsl:if>
                                                        <xsl:if test="./ARINSOG != ''">
                                                            <Anno>
                                                                <xsl:value-of select="./ARINSOG"/>
                                                            </Anno>
                                                        </xsl:if>
                                                    </DataRinnovoPermesso>
                                                </xsl:if>
                                                <xsl:if test="./GSCASOG != '' or ./MSCASOG != '' or ./ASCASOG != ''">
                                                    <DataScadenzaPermesso>
                                                        <xsl:if test="./GSCASOG != ''">
                                                            <Giorno>
                                                                <xsl:value-of select="./GSCASOG"/>
                                                            </Giorno>
                                                        </xsl:if>
                                                        <xsl:if test="./MSCASOG != ''">
                                                            <Mese>
                                                                <xsl:value-of select="./MSCASOG"/>
                                                            </Mese>
                                                        </xsl:if>
                                                        <xsl:if test="./ASCASOG != ''">
                                                            <Anno>
                                                                <xsl:value-of select="./ASCASOG"/>
                                                            </Anno>
                                                        </xsl:if>
                                                    </DataScadenzaPermesso>
                                                </xsl:if>
                                            </PermessoSoggiorno>
                                        </xsl:if>
                                        <xsl:if test="count(./LIBRETTO) > 0">
                                            <xsl:for-each select="./LIBRETTO">
                                                <LibrettoLavoro>
                                                    <xsl:if test="./LIBLAV != ''">
                                                        <NumeroLibretto>
                                                            <xsl:value-of select="./LIBLAV"/>
                                                        </NumeroLibretto>
                                                    </xsl:if>
                                                    <xsl:if test="./DUPLICATO != ''">
                                                        <DuplicatoLibretto>
                                                            <xsl:value-of select="./DUPLICATO"/>
                                                        </DuplicatoLibretto>
                                                    </xsl:if>
                                                    <xsl:if test="./GLIB != '' or ./MLIB != '' or ./ALIB != ''">
                                                        <DataRilascioLibretto>
                                                            <xsl:if test="./GLIB != ''">
                                                                <Giorno>
                                                                    <xsl:value-of select="./GLIB"/>
                                                                </Giorno>
                                                            </xsl:if>
                                                            <xsl:if test="./MLIB != ''">
                                                                <Mese>
                                                                    <xsl:value-of select="./MLIB"/>
                                                                </Mese>
                                                            </xsl:if>
                                                            <xsl:if test="./ALIB != ''">
                                                                <Anno>
                                                                    <xsl:value-of select="./ALIB"/>
                                                                </Anno>
                                                            </xsl:if>
                                                        </DataRilascioLibretto>
                                                    </xsl:if>
                                                    <xsl:if test="./COMLIB != ''">
                                                        <ComuneRilascioLibretto>
                                                            <NomeComune>
                                                                <xsl:value-of select="./COMLIB"/>
                                                            </NomeComune>
                                                            <xsl:if test="./PRCLIB != ''">
                                                                <SiglaProvincia>
                                                                    <xsl:value-of select="./PRCLIB"/>
                                                                </SiglaProvincia>
                                                            </xsl:if>
                                                            <xsl:if test="./NAZCLIB != ''">
                                                                <SiglaStato>
                                                                    <xsl:value-of select="./NAZCLIB"/>
                                                                </SiglaStato>
                                                            </xsl:if>
                                                            <xsl:if test="./DNAZCLIB != ''">
                                                                <NomeStato>
                                                                    <xsl:value-of select="./DNAZCLIB"/>
                                                                </NomeStato>
                                                            </xsl:if>
                                                            <xsl:if test="./ICLIB != ''">
                                                                <CodiceComuneISTAT>
                                                                    <xsl:value-of select="./ICLIB"/>
                                                                </CodiceComuneISTAT>
                                                            </xsl:if>
                                                            <xsl:if test="./IPRCLIB != ''">
                                                                <CodiceProvinciaISTAT>
                                                                    <xsl:value-of select="./IPRCLIB"/>
                                                                </CodiceProvinciaISTAT>
                                                            </xsl:if>
                                                            <xsl:if test="./INAZCLIB != ''">
                                                                <CodiceStatoISTAT>
                                                                    <xsl:value-of select="./INAZCLIB"/>
                                                                </CodiceStatoISTAT>
                                                            </xsl:if>
                                                        </ComuneRilascioLibretto>
                                                    </xsl:if>
                                                    <xsl:if test="./MUNLIB != ''">
                                                        <MunicipioRilascioLibretto>
                                                            <xsl:value-of select="./MUNLIB"/>
                                                        </MunicipioRilascioLibretto>
                                                    </xsl:if>
                                                    <xsl:if test="./SEDLIB != ''">
                                                        <SedeDistaccataLibretto>
                                                            <xsl:value-of select="./SEDLIB"/>
                                                        </SedeDistaccataLibretto>
                                                    </xsl:if>
                                                </LibrettoLavoro>
                                            </xsl:for-each>
                                        </xsl:if>
                                        <xsl:if test="count(./PENSIONE) &gt; 0">
                                            <xsl:for-each select="./PENSIONE">
                                                <Pensione>
                                                    <xsl:if test="./NUMPENS != ''">
                                                        <NumeroPensione>
                                                            <xsl:value-of select="./NUMPENS"/>
                                                        </NumeroPensione>
                                                    </xsl:if>
                                                    <xsl:if test="./CODENTE != ''">
                                                        <CodiceEnteErogatorePensione>
                                                            <xsl:value-of select="./CODENTE"/>
                                                        </CodiceEnteErogatorePensione>
                                                    </xsl:if>
                                                    <xsl:if test="./DESENTE != ''">
                                                        <EnteErogatorePensione>
                                                            <xsl:value-of select="./DESENTE"/>
                                                        </EnteErogatorePensione>
                                                    </xsl:if>
                                                    <xsl:if test="./CODSEDE != ''">
                                                        <CodiceSedePensione>
                                                            <xsl:value-of select="./CODSEDE"/>
                                                        </CodiceSedePensione>
                                                    </xsl:if>
                                                    <xsl:if test="./DESCTG != ''">
                                                        <CategoriaPensione>
                                                            <xsl:value-of select="./DESCTG"/>
                                                        </CategoriaPensione>
                                                    </xsl:if>
                                                </Pensione>
                                            </xsl:for-each>
                                        </xsl:if>
                                    </Documenti>
                                </xsl:if>
                                <xsl:if test="./ATTEN1 != ''">
                                    <Nota>
                                        <xsl:value-of select="./ATTEN1"/>
                                    </Nota>
                                </xsl:if>
                                <xsl:if test="./ATTEN2 != ''">
                                    <Nota>
                                        <xsl:value-of select="./ATTEN2"/>
                                    </Nota>
                                </xsl:if>
                                <xsl:if test="./ATTEN3 != ''">
                                    <Nota>
                                        <xsl:value-of select="./ATTEN3"/>
                                    </Nota>
                                </xsl:if>
                                <xsl:if test="./ATTEN4 != ''">
                                    <Nota>
                                        <xsl:value-of select="./ATTEN4"/>
                                    </Nota>
                                </xsl:if>
                            </Persona>
                        </xsl:if>
                    </xsl:for-each>
                </xsl:otherwise>
            </xsl:choose>
        </NETVA2>
    </xsl:template>
</xsl:stylesheet>
