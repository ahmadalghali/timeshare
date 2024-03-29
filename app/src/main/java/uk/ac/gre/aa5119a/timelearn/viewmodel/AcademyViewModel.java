package uk.ac.gre.aa5119a.timelearn.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import uk.ac.gre.aa5119a.timelearn.model.listing.Subject;
import uk.ac.gre.aa5119a.timelearn.web.response.TeacherListingResponse;

public class AcademyViewModel extends ViewModel {

    private MutableLiveData<String> educationType = new MutableLiveData<>();

    private MutableLiveData<TeacherListingResponse> listingResponse = new MutableLiveData<>();

    private MutableLiveData<Subject> subjectChosen = new MutableLiveData<>();

    public void setEducationType(String educationType){
        this.educationType.setValue(educationType);
    }

    public LiveData<String> getEducationType() {
        return educationType;
    }


    public void setSubjectChosen(Subject subject){
        this.subjectChosen.setValue(subject);
    }

    public LiveData<Subject> getSubjectChosen() {
        return subjectChosen;
    }

    public LiveData<TeacherListingResponse> getListingResponse() {
        return listingResponse;
    }

    public void setListingResponse(TeacherListingResponse listingResponse) {
        this.listingResponse.setValue(listingResponse);
    }


}
