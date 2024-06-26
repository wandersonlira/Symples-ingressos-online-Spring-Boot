package com.symplesweb.controller.dto.view;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.symplesweb.model.entities.ParticipanteEvento;

public class ParticipanteEventoDtoView {
	
	
	private Long participanteEventoDtoView;
	private UUID ticketCode;
	private ParticipanteDtoView participanteDtoView = new ParticipanteDtoView();
	private List<EventoOutputParticipante> listEventoDto = new ArrayList<EventoOutputParticipante>();
	
	
	
	
	public ParticipanteEventoDtoView() {}
	
	
	public ParticipanteEventoDtoView(ParticipanteEvento projection) {
		
		participanteEventoDtoView = projection.getId_ParticipanteEvento();
		ticketCode = projection.getTicketCode();
		
		participanteDtoView.setIdParticipante(projection.getParticipante().getIdParticipante());
		participanteDtoView.setNomeParticipante(projection.getParticipante().getNomeParticipante());
		participanteDtoView.setEmail(projection.getParticipante().getEmail());
		
		
		EventoOutputParticipante eventoDto = new EventoOutputParticipante(projection.getEvento());
		
		listEventoDto.add(eventoDto);
		
	}

	
	

	public Long getParticipanteEventoDtoView() {
		return participanteEventoDtoView;
	}


	public void setParticipanteEventoDtoView(Long participanteEventoDtoView) {
		this.participanteEventoDtoView = participanteEventoDtoView;
	}
	
	public UUID getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(UUID ticketCode) {
		this.ticketCode = ticketCode;
	}


	public ParticipanteDtoView getParticipanteDtoView() {
		return participanteDtoView;
	}


	public void setParticipanteDtoView(ParticipanteDtoView participanteDtoView) {
		this.participanteDtoView = participanteDtoView;
	}


	public List<EventoOutputParticipante> getListEventoDto() {
		return listEventoDto;
	}


	public void setListEventoDto(List<EventoOutputParticipante> listEventoDto) {
		this.listEventoDto = listEventoDto;
	}
	
	
	
	
	

}
