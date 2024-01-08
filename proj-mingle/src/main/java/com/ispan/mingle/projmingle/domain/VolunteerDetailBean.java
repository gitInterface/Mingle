package com.ispan.mingle.projmingle.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Volunteer_Detail")
public class VolunteerDetailBean {
	@Id
	@Column(name = "fk_userID", columnDefinition = "varchar", length = 100)
	private String userId;

	@Column(name = "name", columnDefinition = "nvarchar", length = 20)
	private String name;

	@Column(name = "gender", columnDefinition = "varchar", length = 10)
	private String gender;

	@Column(name = "phone", columnDefinition = "varchar", length = 20)
	private String phone;

	@Column(name = "email", columnDefinition = "varchar", length = 50)
	private String email;

	@Column(name = "introduction", columnDefinition = "nvarchar", length = 300)
	private String introduction;

	@Column(name = "image", columnDefinition = "varbinary", length = 3000)
	private byte[] image;

	@Column(name = "photoSize", columnDefinition = "int")
	private Integer photoSize;

	@Column(name = "photoType", columnDefinition = "varchar", length = 20)
	private String photoType;

	@Column(name = "birth", columnDefinition = "datetime")
	private Date birth;

	@Column(name = "fk_country", columnDefinition = "nvarchar", length = 15)
	private String country;

	@Column(name = "background", columnDefinition = "nvarchar", length = 500)
	private String background;

	@Column(name = "language", columnDefinition = "nvarchar", length = 30)
	private String language;

	@Column(name = "hobby", columnDefinition = "nvarchar", length = 100)
	private String hobby;

	@Column(name = "createdAt", columnDefinition = "datetime")
	private Date createdAt;

	@Column(name = "updatedAt", columnDefinition = "datetime")
	private Date updatedAt;

	@Column(name = "isDeleted", columnDefinition = "bit")
	private Character isDeleted;

}
