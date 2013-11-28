package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model implements Comparable {

    private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Required
	private String nome;
	
	@Required
	private String projeto;
	
	@Required
	private String descricao;
	
	@Required
	private int prioridade;
	
	private boolean status;
	
	public static Finder<Long,Task> find = new Finder(Long.class, Task.class);
	
    public static List<Task> all() {
        List<Task> tasks = find.all();
        Collections.sort(tasks);
        return tasks;
    }
    
    public static void update(Long id, boolean status) {
        Task aux = new Task();
        
        aux.setStatus(status);
        aux.setNome(find.ref(id).getNome());
        aux.setProjeto(find.ref(id).getProjeto());
        aux.setDescricao(find.ref(id).getDescricao());
        aux.setPrioridade(find.ref(id).getPrioridade());
        
        delete(id);
        create(aux);       
    }

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return status;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

	@Override
	public int compareTo(Object o) {
		return this.prioridade - (((Task)o).prioridade);
	}

}