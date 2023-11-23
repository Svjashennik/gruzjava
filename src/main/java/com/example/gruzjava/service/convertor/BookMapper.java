package com.example.gruzjava.service.convertor;


import com.example.gruzjava.models.Book;
import com.example.gruzjava.service.dto.BookDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book dtoToModel(BookDto bookDto);

    BookDto modelToDto(Book book);

    List<BookDto> toListDto(List<Book> books);
}
