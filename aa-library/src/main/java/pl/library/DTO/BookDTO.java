package pl.library.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.library.model.Author;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

	private Long id;
	private String title;
	private Author author;
	private int published;
	private String isbn;
}
