/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.service.custom;

import pos.layerd.dto.OrderDto;
import pos.layerd.service.SuperService;

/**
 *
 * @author Admin
 */
public interface OrderService extends SuperService{

    String placeorder(OrderDto dto) throws Exception;

}
