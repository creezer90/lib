package pl.library.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.library.model.AuthorDTO;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private String name;
	private AuthorDTO author;
	private int published;
	private String isbn;
}
