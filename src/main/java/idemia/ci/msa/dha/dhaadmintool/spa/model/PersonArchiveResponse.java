package idemia.ci.msa.dha.dhaadmintool.spa.model;

public class PersonArchiveResponse {
	private String ras_pin;
	private String ras_pcn;
	private String ras_idn;
	private String ras_tcn;
	private String ras_formnumber;
	private String record_type;
	private String filename;
	private String ras_batchnumber;
	private String nist;
	private String date_created;

	public String getRas_tcn() {
		return ras_tcn;
	}

	public void setRas_tcn(String ras_tcn) {
		this.ras_tcn = ras_tcn;
	}

	public String getRas_pin() {
		return ras_pin;
	}

	public void setRas_pin(String ras_pin) {
		this.ras_pin = ras_pin;
	}

	public String getRas_pcn() {
		return ras_pcn;
	}

	public void setRas_pcn(String ras_pcn) {
		this.ras_pcn = ras_pcn;
	}

	public String getRas_idn() {
		return ras_idn;
	}

	public void setRas_idn(String ras_idn) {
		this.ras_idn = ras_idn;
	}

	public String getRas_formnumber() {
		return ras_formnumber;
	}

	public void setRas_formnumber(String ras_formnumber) {
		this.ras_formnumber = ras_formnumber;
	}

	public String getRecord_type() {
		return record_type;
	}

	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getRas_batchnumber() {
		return ras_batchnumber;
	}

	public void setRas_batchnumber(String ras_batchnumber) {
		this.ras_batchnumber = ras_batchnumber;
	}

	public String getNist() {
		return nist;
	}

	public void setNist(String nist) {
		this.nist = nist;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

}
