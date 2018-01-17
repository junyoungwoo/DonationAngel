package dto;

/*DROP TABLE DONOR
CASCADE CONSTRAINS;

CREATE TABLE DONOR(
	ID VARCHAR2(50) PRIMARY KEY,
	PWD VARCHAR2(50) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	MAIL VARCHAR2(50) NOT NULL,
	AUTH NUMBER(1) NOT NULL,
	CASH NUMBER(38) NOT NULL,
	POINT NUMBER(38) NOT NULL,
	JOINDATE DATE NOT NULL
);*/

public class DonorDto {
	
	private String id;
	private String pwd;
	private String name;
	private String mail;
	private int auth;
	private int cash;
	private int point;
	private String joindate;
	
	public DonorDto() {}

	public DonorDto(String id, String pwd, String name, String mail, int auth, int cash, int point, String joindate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.mail = mail;
		this.auth = auth;
		this.cash = cash;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "DonorDto [id=" + id + ", pwd=" + pwd + ", name=" + name + ", mail=" + mail + ", auth=" + auth
				+ ", cash=" + cash + ", point=" + point + ", joindate=" + joindate + "]";
	};

}
