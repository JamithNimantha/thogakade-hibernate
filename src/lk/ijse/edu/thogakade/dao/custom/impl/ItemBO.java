package lk.ijse.edu.thogakade.dao.custom.impl;

import lk.ijse.edu.thogakade.business.SuperBO;
import lk.ijse.edu.thogakade.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    public boolean addItem(ItemDTO itemDTO) throws  Exception;

    public boolean updateItem(ItemDTO itemDTO) throws Exception;

    public boolean deleteItem(ItemDTO itemDTO) throws Exception;

    public ArrayList<ItemDTO> getAllItems() throws Exception;
}
