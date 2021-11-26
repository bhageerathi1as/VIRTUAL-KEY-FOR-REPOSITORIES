package com.app.bo;

import java.io.IOException;
import java.util.List;

import com.app.exception.AlphaNumericOnly;
import com.app.exception.FileNameNotFoundException;

public interface FileManagerBO<FileDetail> {
		public <Filedetail> Filedetail createFile(String name) throws IOException;
		public boolean deleteFile(String name) throws FileNameNotFoundException;
		public List<FileDetail> getAllFiles();
		public boolean searchFile(String name);
		FileDetail createFile1(String name) throws IOException, SecurityException, AlphaNumericOnly;
}