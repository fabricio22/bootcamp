package com.project.bootcamp.mapper;

import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setDate(dto.getDate());
        stock.setVariation(dto.getVariation());

        return stock;
    }

    public StockDTO toDTO(Stock stock){
        StockDTO stockDto = new StockDTO();
        stockDto.setId(stock.getId());
        stockDto.setName(stock.getName());
        stockDto.setPrice(stock.getPrice());
        stockDto.setDate(stock.getDate());
        stockDto.setVariation(stock.getVariation());

        return stockDto;
    }

    public List<StockDTO> toDTO(List<Stock> list){
        return list.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
