package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.exception.SystemException;
import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.Device;
import com.itplayer.core.device.repository.DeviceRepository;
import com.itplayer.core.device.service.DeviceService;
import javafx.scene.control.Cell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Date;

@Service
public class DeviceServiceImpl extends BaseServiceImpl<Device, Long> implements DeviceService {

    private DeviceRepository deviceRepository;

    @Autowired
    public void setDeviceRepository(DeviceRepository deviceRepository) {
        super.setRepostory(deviceRepository);
        this.deviceRepository = deviceRepository;
    }

    @Override
    public void improt(MultipartFile file, String deviceName) {
        Date date = new Date();
        Workbook book;
        try {
            book = new HSSFWorkbook(file.getInputStream());
        } catch (Exception e) {
            try {
                book = new XSSFWorkbook(file.getInputStream());
            } catch (Exception e2) {
                throw new SystemException("文件解析失败，请检查文档格式，或下载文档模板录入");
            }
        }


//        Sheet sheetAt = book.getSheetAt(0);
//        int lastRowNum = sheetAt.getLastRowNum();
//        int index = 0;
//        for (int i = 1; i <= lastRowNum; i++) {
//            productCard = new ProductCard();
//            Row row = sheetAt.getRow(i);
//            if (row == null) {
//                continue;
//            }
//            Cell cell0 = row.getCell(0);
//            if (cell0 != null) {
//                cell0.setCellType(Cell.CELL_TYPE_STRING);
//                String cardSer = row.getCell(0).getStringCellValue();
//                productCard.setCardSerNum(cardSer);
//            }
//            productCard.setProductSerNum(productSerNum);
//            productCard.setCreateDate(date);
//            Cell cell = row.getCell(1);
//            if (cell != null) {
//                cell.setCellType(Cell.CELL_TYPE_STRING);
//                String stringCellValue = cell.getStringCellValue();
//                productCard.setCardPwd(stringCellValue);
//                //productCard.setCardPwd(AesUtil.aesEncrypt(stringCellValue, SystemConstant.SECRET_KEY));
//            }
//            productCard.setExpiryDate(DateUtils.strToDate(row.getCell(2).getStringCellValue(), DateUtils.DATE_DATE));
//            productCard.setHasUsed((int) row.getCell(3).getNumericCellValue() == 0 ? false : true);
//            create(productCard);
//        }
    }
}
