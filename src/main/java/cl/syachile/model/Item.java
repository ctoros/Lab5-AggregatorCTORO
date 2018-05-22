package cl.syachile.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord(length = 219)
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

@XmlElement
@DataField(pos = 1, length = 36)
public String UUID;

	@XmlElement
	@DataField(pos = 2, length = 4)
	public String HORAGENERACIONARCHIVO;

	@XmlElement
	@DataField(pos = 3, length = 1)
	public String TIPOREGISTRO;

	@XmlElement
	@DataField(pos = 4, length = 8,pattern="yyyyMMdd")
	public String FECHAGENERACIONARCHIVO;

	@XmlElement
	@DataField(pos = 5, length = 39)
	public String DESCRIPCIONARCHIVO;

	@XmlElement
	@DataField(pos = 6, length = 11)
	public String NOMLOGICOARCHIVO;

	@XmlElement
	@DataField(pos = 7, length = 10)
	public String RUTORIGINADOR;

	@XmlElement
	@DataField(pos = 8, length = 5)
	public String CODCLIENDCVORIGINADOR;

	@XmlElement
	@DataField(pos = 9, length = 10)
	public String RUTDESTINATARIO;

	@XmlElement
	@DataField(pos = 10, length = 5)
	public String CODCLIENDCVDESTINATARIO;

	@XmlElement
	@DataField(pos = 11, length = 5)
	public String DISPONIBLE;

	@XmlElement
	@DataField(pos = 12, length = 32)
	public String NOMBREARC;

	@XmlElement
	@DataField(pos = 13, length = 21)
	public String HORACARGA;

	@XmlElement
	@DataField(pos = 14, length = 1)
	public String TERMINO;

	@XmlElement
	@DataField(pos = 15, length = 5)
	public String STEP1;

	@XmlElement
	@DataField(pos = 16, length = 13)
	public String FECHAINI;

	@XmlElement
	@DataField(pos = 17, length = 13)
	public String FECHATERM;

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public String getHORAGENERACIONARCHIVO() {
		return HORAGENERACIONARCHIVO;
	}

	public void setHORAGENERACIONARCHIVO(String hORAGENERACIONARCHIVO) {
		HORAGENERACIONARCHIVO = hORAGENERACIONARCHIVO;
	}

	public String getTIPOREGISTRO() {
		return TIPOREGISTRO;
	}

	public void setTIPOREGISTRO(String tIPOREGISTRO) {
		TIPOREGISTRO = tIPOREGISTRO;
	}

	public String getFECHAGENERACIONARCHIVO() {
		return FECHAGENERACIONARCHIVO;
	}

	public void setFECHAGENERACIONARCHIVO(String fECHAGENERACIONARCHIVO) {
		FECHAGENERACIONARCHIVO = fECHAGENERACIONARCHIVO;
	}

	public String getDESCRIPCIONARCHIVO() {
		return DESCRIPCIONARCHIVO;
	}

	public void setDESCRIPCIONARCHIVO(String dESCRIPCIONARCHIVO) {
		DESCRIPCIONARCHIVO = dESCRIPCIONARCHIVO;
	}

	public String getNOMLOGICOARCHIVO() {
		return NOMLOGICOARCHIVO;
	}

	public void setNOMLOGICOARCHIVO(String nOMLOGICOARCHIVO) {
		NOMLOGICOARCHIVO = nOMLOGICOARCHIVO;
	}

	public String getRUTORIGINADOR() {
		return RUTORIGINADOR;
	}

	public void setRUTORIGINADOR(String rUTORIGINADOR) {
		RUTORIGINADOR = rUTORIGINADOR;
	}

	public String getCODCLIENDCVORIGINADOR() {
		return CODCLIENDCVORIGINADOR;
	}

	public void setCODCLIENDCVORIGINADOR(String cODCLIENDCVORIGINADOR) {
		CODCLIENDCVORIGINADOR = cODCLIENDCVORIGINADOR;
	}

	public String getRUTDESTINATARIO() {
		return RUTDESTINATARIO;
	}

	public void setRUTDESTINATARIO(String rUTDESTINATARIO) {
		RUTDESTINATARIO = rUTDESTINATARIO;
	}

	public String getCODCLIENDCVDESTINATARIO() {
		return CODCLIENDCVDESTINATARIO;
	}

	public void setCODCLIENDCVDESTINATARIO(String cODCLIENDCVDESTINATARIO) {
		CODCLIENDCVDESTINATARIO = cODCLIENDCVDESTINATARIO;
	}

	public String getDISPONIBLE() {
		return DISPONIBLE;
	}

	public void setDISPONIBLE(String dISPONIBLE) {
		DISPONIBLE = dISPONIBLE;
	}

	public String getNOMBREARC() {
		return NOMBREARC;
	}

	public void setNOMBREARC(String nOMBREARC) {
		NOMBREARC = nOMBREARC;
	}

	public String getHORACARGA() {
		return HORACARGA;
	}

	public void setHORACARGA(String hORACARGA) {
		HORACARGA = hORACARGA;
	}

	public String getTERMINO() {
		return TERMINO;
	}

	public void setTERMINO(String tERMINO) {
		TERMINO = tERMINO;
	}

	public String getSTEP1() {
		return STEP1;
	}

	public void setSTEP1(String sTEP1) {
		STEP1 = sTEP1;
	}

	public String getFECHAINI() {
		return FECHAINI;
	}

	public void setFECHAINI(String fECHAINI) {
		FECHAINI = fECHAINI;
	}

	public String getFECHATERM() {
		return FECHATERM;
	}

	public void setFECHATERM(String fECHATERM) {
		FECHATERM = fECHATERM;
	}

}
