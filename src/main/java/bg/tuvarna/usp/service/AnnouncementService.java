package bg.tuvarna.usp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.tuvarna.usp.dto.CreateAnnouncementDTO;
import bg.tuvarna.usp.dto.FilterAnnouncementDTO;
import bg.tuvarna.usp.entity.Announcement;
import bg.tuvarna.usp.entity.AnnouncementType;
import bg.tuvarna.usp.repository.AnnouncementRepository;

@Service
public class AnnouncementService {
	
	@Autowired
	AnnouncementRepository ar;
	
	public List<Announcement> getAllAnnouncements() {
		return ar.getAnnouncements();
	}
	
	public List<Announcement> filterAnnouncements(FilterAnnouncementDTO dto) {
		return ar.filterAnnouncements(dto.getCarBrand(), dto.getCarModel(), dto.getCityId(), dto.getCarTypeId());
	}
	
	public List<AnnouncementType> getAllAnnouncementTypes() {
		return ar.getAnnouncementTypes();
	}
	
	public Announcement getAnnouncement(Integer id) {
		return ar.getAnnouncement(id);
	}
	
	public Announcement createAnnouncement(CreateAnnouncementDTO dto) {
		return ar.createAnnouncement(dto.getTitle(), dto.getAnnouncementTypeId(), dto.getContactName(), dto.getContactNumber(), dto.getCityId(), dto.getCarTypeId(), dto.getBrand(), dto.getModel(), dto.getDrivetrainId(), dto.getColor(), dto.getPower(), dto.getTransmission(), dto.getEngine(), dto.getDoors(), dto.getWeight(), dto.getFuelId(), dto.getDisplacement(), dto.getDescription(), dto.getPrice());
	}
}
