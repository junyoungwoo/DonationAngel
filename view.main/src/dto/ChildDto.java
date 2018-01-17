package dto;

/*
DROP TABLE CHILD
CASCADE CONSTRAINTS;

CREATE TABLE CHILD(
	CID NUMBER(5) PRIMARY KEY,
	NAME VARCHAR2(50) NOT NULL,
	AGE NUMBER(10) NOT NULL,
	GENDER VARCHAR2(50) NOT NULL,
	COUNTRY VARCHAR2(50) NOT NULL,
	PHOTO VARCHAR2(50) NOT NULL,
	TITLE VARCHAR2(200) NOT NULL,
	STORY VARCHAR2(4000) NOT NULL,
	GOAL NUMBER(38) NOT NULL,
	GDATE DATE NOT NULL,
	WDATE DATE NOT NULL,
	EXP NUMBER(38) NOT NULL,
	STEPONE VARCHAR2(200) NOT NULL,
	STEPTWO VARCHAR2(200) NOT NULL,
	STEPTHREE VARCHAR2(200) NOT NULL
);

DROP SEQUENCE SEQ_CID;

CREATE SEQUENCE SEQ_CID
START WITH 1 INCREMENT BY 1;
 */

public class ChildDto {
	private int cid;
	private String name;
	private int age;
	private String gender;
	private String country;
	private String photo;
	private String title;
	private String story;
	private int goal;
	private String gdate;
	private String wdate;
	private int exp;
	private String step1;
	private String step2;
	private String step3;
	
	public ChildDto() {}

	public ChildDto(int cid, String name, int age, String gender, String country, String photo, String title,
			String story, int goal, String gdate, String wdate, int exp, String step1, String step2, String step3) {
		super();
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.country = country;
		this.photo = photo;
		this.title = title;
		this.story = story;
		this.goal = goal;
		this.gdate = gdate;			// 마감일
		this.wdate = wdate;			// 등록일
		this.exp = exp;				// 진행수치
		this.step1 = step1;
		this.step2 = step2;
		this.step3 = step3;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public String getGdate() {
		return gdate;
	}

	public void setGdate(String gdate) {
		this.gdate = gdate;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getStep1() {
		return step1;
	}

	public void setStep1(String step1) {
		this.step1 = step1;
	}

	public String getStep2() {
		return step2;
	}

	public void setStep2(String step2) {
		this.step2 = step2;
	}

	public String getStep3() {
		return step3;
	}

	public void setStep3(String step3) {
		this.step3 = step3;
	}

	@Override
	public String toString() {
		return "ChildDto [cid=" + cid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", country="
				+ country + ", photo=" + photo + ", title=" + title + ", story=" + story + ", goal=" + goal + ", gdate="
				+ gdate + ", wdate=" + wdate + ", exp=" + exp + ", step1=" + step1 + ", step2=" + step2 + ", step3="
				+ step3 + "]";
	};

}
