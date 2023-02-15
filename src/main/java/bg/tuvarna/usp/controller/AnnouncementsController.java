package bg.tuvarna.usp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import bg.tuvarna.usp.dto.CreateAnnouncementDTO;
import bg.tuvarna.usp.dto.FilterAnnouncementDTO;
import bg.tuvarna.usp.entity.Announcement;
import bg.tuvarna.usp.service.AnnouncementService;
import bg.tuvarna.usp.service.ObviousService;

@Controller
public class AnnouncementsController {

	@Autowired
	private AnnouncementService as;
	
	@Autowired
	private ObviousService os;

	@GetMapping("/announcements")
	public String home(Model model) {
		model.addAttribute("announcementsList", as.getAllAnnouncements());

		model.addAttribute("citiesList", os.getAllCities());
		model.addAttribute("announcementTypesList", as.getAllAnnouncementTypes());
		return "Announcements";
	}

	@PostMapping("/announcements")
	public String viewAnnouncement(@ModelAttribute("id") int id) {
		return "redirect:/view-announcement/" + id;
	}
	
	@PostMapping("/search-announcements")
	public String search(FilterAnnouncementDTO dto, Model model) {
		model.addAttribute("announcementsList", as.filterAnnouncements(dto));
		
		model.addAttribute("citiesList", os.getAllCities());
		model.addAttribute("announcementTypesList", as.getAllAnnouncementTypes());
		
		return "Announcements";
	}

	@GetMapping("/create-announcement")
	public String create(Model model) {
		model.addAttribute("announcementTypes", as.getAllAnnouncementTypes());
		model.addAttribute("cities", os.getAllCities());
		model.addAttribute("carTypes", os.getAllCarTypes());
		model.addAttribute("carDrivetrains", os.getAllCarDrivetrains());
		model.addAttribute("carFuels", os.getAllCarFuels());
		
		return "CreateAnnouncement";
	}
	
	@PostMapping("/create-announcement")
	public String create(CreateAnnouncementDTO dto, Model model) {
		Boolean created = Boolean.TRUE;
		Announcement createdAnnouncement = as.createAnnouncement(dto);
		if(createdAnnouncement == null) {
			created = Boolean.FALSE;
			return "CreateAnnouncement";
		}
		
		model.addAttribute("created", created);
		System.out.println("announcement created: " + created);
		return "redirect:/view-announcement/" + createdAnnouncement.getId();
	}
	
	@GetMapping("/view-announcement/{id}")
	public String view(@PathVariable("id") int id, Model model) {
		model.addAttribute("viewAnnouncement", as.getAnnouncement(Integer.valueOf(id)));
		return "ViewAnnouncement";
	}
}
