package com.netuno.planilhasfiscalizacao;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import com.netuno.planilhasfiscalizacao.dao.REG_A170DAOImpl;
import com.netuno.planilhasfiscalizacao.modelo.REG_A170;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ImportaPlanilhaIndividual {

	public static void main(String[] args) throws BiffException, IOException {
		FileFilter filter = new FileFilter() {
			public boolean accept(File file) {
				return file.getName().endsWith(".xls");
			}
		};

		REG_A170DAOImpl rEG_A170DAO = new REG_A170DAOImpl();

		System.out.println("Inicio da leitura");

		File dir = new File("d:\\trabalho_fiscal\\2016");
		File[] files = dir.listFiles(filter);
		for (int fi = 0; fi < files.length; fi++) {
			System.out.println(files[fi].getName());
			Workbook workbook = Workbook.getWorkbook(files[fi]);
			int planilhas = workbook.getSheets().length;
			int linhas = 0;
			for (int j = 0; j < planilhas; j++) {
				Sheet sheet = workbook.getSheet(j);
				linhas = sheet.getRows();
				for (int i = 1; i < linhas; i++) {
					if (sheet.getName().equals("REG A170")) {

						System.out.println(sheet.getName());

						REG_A170 a = new REG_A170();
						
						Cell celula0 = sheet.getCell(0, i);
						a.setNome_part(celula0.getContents());
						
						Cell celula1 = sheet.getCell(1, i);
						a.setCnpj_cpf(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setSer(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setNum_doc(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setDt_doc(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setDt_exe_serv(celula5.getContents());

						Cell celula6 = sheet.getCell(6, i);
						a.setVl_doc(celula6.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setDescr_item(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setCst_pis(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setVl_bc_pis(celula9.getContents());

						Cell celula10 = sheet.getCell(10, i);
						a.setAliq_pis(celula10.getContents());

						Cell celula11 = sheet.getCell(11, i);
						a.setVl_pis(celula11.getContents());

						Cell celula12 = sheet.getCell(12, i);
						a.setVl_bc_cofins(celula12.getContents());

						Cell celula13 = sheet.getCell(13, i);
						a.setAliq_confis(celula13.getContents());

						Cell celula14 = sheet.getCell(14, i);
						a.setVl_cofins(celula14.getContents());

						Cell celula15 = sheet.getCell(15, i);
						a.setCod_cta(celula15.getContents());

						rEG_A170DAO.salvar(a);
					}
				}
			}
		}
		System.out.println("Fim da leitura");
		System.exit(1);

	}

}
