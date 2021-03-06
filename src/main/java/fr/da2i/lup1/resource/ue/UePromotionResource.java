package fr.da2i.lup1.resource.ue;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.j256.ormlite.dao.Dao;

import fr.da2i.lup1.entity.note.Ue;
import fr.da2i.lup1.entity.note.UePromotion;
import fr.da2i.lup1.filter.PromotionAccess;
import fr.da2i.lup1.resource.formation.AnnualResource;
import fr.da2i.lup1.security.Authenticated;
import fr.da2i.lup1.util.DaoProvider;

@Authenticated
@PromotionAccess
public class UePromotionResource extends AnnualResource {

	Dao<UePromotion, Integer> dao;
	
	public UePromotionResource() {
		dao = DaoProvider.getDao(UePromotion.class);
	}
	
	/**
	 * Retourne la liste des UE de la promotion
	 * 
	 * @return	La liste des UEs de la promotion
	 */
	@GET
	@RolesAllowed({ "responsable_formation", "etudiant" })
	@Produces("application/json")
	public Response getUesPromotion() {
		return Response.ok("Retourne la liste des UE de la promotion").build();
	}
	
	/**
	 * Retourne les informations de l'UE
	 * 
	 * @param	ueId
	 * 				L'ID de l'UE à rechercher
	 * 
	 * @return	Les informations de cette UE
	 */
	@GET
	@RolesAllowed({ "responsable_formation", "etudiant" })
	@Produces("application/json")
	@Path("{ueId: [0-9]+}")
	public Response getUePromotion(@PathParam("ueId") int ueId) {
		return Response.ok("Retourne les informations de l'UE").build();
	}
	
	/**
	 * Dépréciée
	 */
	@PUT
	@RolesAllowed("responsable_formation")
	@Path("{ueId: [0-9]+}")
	public Response putUe(@PathParam("ueId") int ueId) {
		return Response.status(Status.NOT_IMPLEMENTED).build();
	}
	
	/**
	 * Ajouter une UE dans la promotion
	 * 
	 * @param	ue
	 * 				L'UE à ajouter à la promotion
	 * 
	 * @return	Le code de retour de l'ajout à la base
	 */
	@POST
	@RolesAllowed("responsable_formation")
	public Response postUe(Ue ue) {
		return Response.ok("Ajouter une UE dans la promotion").build();
	}
	
	/**
	 * Retire toutes les UE de la promotion
	 * 
	 * @return	Le code de retour des suppressions
	 */
	@DELETE
	@RolesAllowed("responsable_formation")
	public Response deleteUes() {
		return Response.ok("Retire toutes les UE de la promotion").build();
	}
	
	/**
	 * Retire une UE de la promotion
	 * 
	 * @param	ueId
	 * 				L'UE à retirer
	 * 
	 * @return	Le code de retour de la suppression
	 */
	@DELETE
	@RolesAllowed("responsable_formation")
	@Path("{ueId: [0-9]+}")
	public Response deleteUes(@PathParam("ueId") int ueId) {
		return Response.ok("Retire l'UE à cette adresse de la promotion").build();
	}
}
