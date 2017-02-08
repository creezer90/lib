package pl.library.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

	private String name;
	private String surname;
	private Date born;
	private Date died;
	@OneToMany(mappedBy="author")
	private List<BookDTO> books;
}
