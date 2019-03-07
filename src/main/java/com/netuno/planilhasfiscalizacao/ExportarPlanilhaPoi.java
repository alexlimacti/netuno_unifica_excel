package com.netuno.planilhasfiscalizacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.netuno.planilhasfiscalizacao.dao.REG_F120DAOImpl;
import com.netuno.planilhasfiscalizacao.modelo.REG_F120;

public class ExportarPlanilhaPoi {

	public static void main(String[] args) throws IOException {

		System.out.println("Inicio da Exportação");
		String excelFileName = "D:/Teste_poi.xls";// name of excel file

		String sheetName = "REG F120";// name of sheet

		REG_F120DAOImpl rEG_F120DAO = new REG_F120DAOImpl();
		List<REG_F120> rEG_F120 = new ArrayList<REG_F120>(rEG_F120DAO.listar(REG_F120.class));

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(sheetName);

		// iterating r number of rows
		for (int r = 0; r < rEG_F120.size(); r++) {
			HSSFRow row = sheet.createRow(r);

			// iterating c number of columns
			for (int c = 1; c == 11; c++) {
				HSSFCell cell = row.createCell(c);

				cell.setCellValue("Cell " + r + " " + c);
			}
		}

		FileOutputStream fileOut = new FileOutputStream(excelFileName);

		// write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();

	}

}
