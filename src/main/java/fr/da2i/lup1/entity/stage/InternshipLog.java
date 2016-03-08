package fr.da2i.lup1.entity.stage;

import java.sql.Timestamp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import fr.da2i.lup1.util.Identifiable;

@DatabaseTable(tableName = "internship_log")
public class InternshipLog extends Identifiable<Integer> {

	@DatabaseField(columnName = "internship_log_id", id = true)
	private int internshipLogId;
	@DatabaseField(columnName = "date_log")
	private Timestamp dateLog;
	@DatabaseField(columnName = "quote")
	private String quote;
	@DatabaseField(columnName = "flag_id")
	private int flagId;
	@DatabaseField(columnName = "member_id")
	private int memberId;
	@DatabaseField(columnName = "internship_id")
	private int internshipId;
	
	public InternshipLog(int id, Timestamp d, String q, int f, int m, int i) {
		this.internshipLogId = id;
		this.dateLog = d;
		this.quote = q;
		this.flagId = f;
		this.memberId = m;
		this.internshipId = i;
	}
	
	public InternshipLog() {}

	@Override
	public Integer getId() {
		return this.internshipLogId;
	}

	@Override
	public void setId(Integer id) {
		this.internshipLogId = id;
	}

	public Timestamp getDateLog() {
		return dateLog;
	}

	public void setDateLog(Timestamp dateLog) {
		this.dateLog = dateLog;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public int getFlagId() {
		return flagId;
	}

	public void setFlagId(int flagId) {
		this.flagId = flagId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getInternshipId() {
		return internshipId;
	}

	public void setInternshipId(int internshipId) {
		this.internshipId = internshipId;
	}
	
	public String toString() {
		return "InternshipLog ["
				+ "internship_log_id=" + getId() + ", "
				+ "date_log=" + getDateLog() + ", "
				+ "quote=" + getQuote() + ", "
				+ "flag_id=" + getFlagId() + ", "
				+ "member_id=" + getMemberId() + ", "
				+ "internship_id=" + getInternshipId()
				+ "]";
	}
}