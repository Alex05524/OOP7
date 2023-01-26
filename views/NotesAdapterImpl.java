package OOP7.views;

import OOP7.model.domain.entity.Note;

public class NotesAdapterImpl implements INotesAdapter {

    @Override
    public String getView(Note note) {
        return note.toString();
    }
}