package com.student.admission.admissiondao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.student.admission.admissiondao.entity.Student;
import com.student.admission.admissiondao.vo.StudentVO;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminDAOMapper {

	public static AdminDAOMapper STUDENT_MAPPER = Mappers.getMapper(AdminDAOMapper.class);

	@Mappings({
			@Mapping(target = "sDob", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsDob()))"),
			@Mapping(target = "sAdmissionDate", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsAdmissionDate()))") })
	Student voToEntity(StudentVO studentVO);

	@Mappings({
			@Mapping(target = "sDob", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.datetoStringConverter(student.getsDob()))"),
			@Mapping(target = "sAdmissionDate", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.datetoStringConverter(student.getsAdmissionDate()))") })
	StudentVO entityToVo(Student student);
}