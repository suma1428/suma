package com.xworkz.tester;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dao.SpeakerDAOImpl;
import com.xworkz.speaker.dto.SpeakerDTO;
import com.xworkz.speaker.service.SpeakerServiceImpl;

public class Tester {
	public static void main(String[] args) {
		SpeakerDAO  speakerdao = new SpeakerDAOImpl();
		SpeakerServiceImpl speakerservice = new SpeakerServiceImpl();
		  SpeakerDTO speakerDTO = new SpeakerDTO(1,"realme",1500,"black","small",true);
		  SpeakerDTO speakerDTO1 = new SpeakerDTO(2,"realme",2000,"black","small",true);
		  SpeakerDTO speakerDTO2 = new SpeakerDTO(3,"redmi",2000,"black","small",true);
			speakerservice.validateAndSave(speakerDTO2);
			
			}

		}
	