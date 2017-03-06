package pl.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.library.DTO.AuthorDTO;
import pl.library.DTO.BookDTO;
import pl.library.command.NewBookCommand;
import pl.library.model.Author;
import pl.library.model.Book;
import pl.library.service.AuthorService;
import pl.library.service.BookService;
import pl.library.service.ObjectConverter;
import pl.library.service.impl.converter.dtoToModel.BookDtoToBookConverter;
import pl.library.service.impl.converter.modelToDto.AuthorToAuthorDtoConverter;
import pl.library.service.impl.converter.modelToDto.BookToBookDtoConverter;

@Controller
@RequestMapping("/")
public class ViewController {

	@Autowired
	private AuthorService authorService;

	@Autowired
	private BookService bookService;

	@Autowired
	private ObjectConverter<Author, AuthorDTO> authorToAuthorDtoConverter;

	@Autowired
	private ObjectConverter<Book, BookDTO> bookToBookDtoConverter;

	@Autowired
	private ObjectConverter<AuthorDTO, Author> authorDtoToAuthorConverter;

	@Autowired
	private ObjectConverter<NewBookCommand, Book> bookCommandToBookConverter;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String view(ModelMap model) {
		model.addAttribute("authorForm", new AuthorDTO());
		model.addAttribute("bookCommandForm", new NewBookCommand());
		model.addAttribute("books", bookToBookDtoConverter.convert(bookService.findAllBooks()));
		model.addAttribute("authors", authorToAuthorDtoConverter.convert(authorService.findAllAuthors()));
		return "bsTest";
	}

	@RequestMapping(value = "/addAuthor", method = RequestMethod.POST)
	public String addAuthor(@ModelAttribute("authorForm") AuthorDTO authorDTO, ModelMap model) {
		authorService.add(authorDtoToAuthorConverter.convert(authorDTO));
		return "redirect:/";

	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("bookCommandForm") NewBookCommand bookCommand, ModelMap model) {
		bookService.saveBook(bookCommandToBookConverter.convert(bookCommand));
		return "redirect:/";

	}

	@RequestMapping(value = "/editBook", method = RequestMethod.POST)
	public String editBook(@ModelAttribute("bookCommandForm") NewBookCommand bookCommand, ModelMap model) {
		bookService.saveBook(bookCommandToBookConverter.convert(bookCommand));
		return "redirect:/";

	}

	@RequestMapping(value = "/removeBook", method = RequestMethod.POST)
	public String removeBook(@RequestParam("idToRemove") Long id, ModelMap model) {
		bookService.removeBook(id);
		return "redirect:/";
	}
}
