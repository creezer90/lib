package pl.library.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

	private String name;
	@ManyToOne
	@JoinColumn(name = "author_id")
	private AuthorDTO author;
	private int published;
	private String isbn;

}
