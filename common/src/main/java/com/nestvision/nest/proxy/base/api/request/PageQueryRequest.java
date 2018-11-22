package com.nestvision.nest.proxy.base.api.request;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;

public abstract class PageQueryRequest<T> {

    @Min(value = 0, message = "page参数不能小于0")
    private int page = 0;

    @Min(value = 1, message = "size参数不能小于1")
    @Max(value = 100, message = "size参数不能大于100")
    private int size = 20;

    private String sort;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    private Direction parseDirection(String dir) {
        try {
            return Direction.valueOf(StringUtils.upperCase(dir));
        } catch (Exception e) {
            return null;
        }

    }

    protected List<Order> parseOrders() {

        String[] array = StringUtils.split(sort, ",");
        List<Order> list = null;
        if (array != null) {
            list = new ArrayList<>(array.length);
            for (String str : array) {
                String[] d = StringUtils.split(str, "=");
                if (d.length > 1) {
                    String dir = d[1];
                    String prop = d[0];
                    Direction direction = parseDirection(StringUtils.upperCase(dir));
                    if (direction != null) {
                        Order order = new Order(direction, prop);
                        list.add(order);
                    }
                }
            }
        }
        return list;
    }

    public Pageable convertToPageRequest() {

        List<Order> orders = parseOrders();
        if (orders == null || orders.isEmpty()) {
            return new PageRequest(page, size);
        }
        return new PageRequest(page, size, new Sort(orders));
    }

    public abstract Specification<T> convertToSpecification();
}
