package com.lophiester.dsmovie.services;

import com.lophiester.dsmovie.dto.MovieDTO;
import com.lophiester.dsmovie.entities.Movie;
import com.lophiester.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository mRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = mRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(MovieDTO::new);
        return page;
    }

    public MovieDTO findById(Long id) {
       Movie result = mRepository.findById(id).get();
       MovieDTO dto = new MovieDTO(result);
       return dto;
    }
}
