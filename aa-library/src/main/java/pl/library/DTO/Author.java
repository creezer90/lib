package pl.library.DTO;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.library.model.BookDTO;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

	private String name;
	private String surname;
	private Date born;
	private Date died;
	private List<BookDTO> books;

}
