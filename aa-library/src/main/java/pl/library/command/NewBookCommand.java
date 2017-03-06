package pl.library.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewBookCommand {

	private Long id;
	private String title;
	private Long authorId;
	private int published;
	private String isbn;
}
