package pl.library.DTO;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.library.model.Book;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

	private Long id;
	private String name;
	private String surname;
	private String born;
	private String died;
	private List<Book> books;

	@Override
	public String toString() {
		return name + " " + surname;
	}

}
