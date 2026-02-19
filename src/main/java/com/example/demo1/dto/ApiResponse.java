package com.example.demo1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) // Nếu field nào null thì không hiện trong JSON
public class ApiResponse<T> {
    private int code; // Mã lỗi tự định nghĩa (vd: 1000 cho thành công)
    private String message; // Thông báo
    private T result; // Dữ liệu thực tế (Object, List...)
}