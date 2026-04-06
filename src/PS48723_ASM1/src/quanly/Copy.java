package quanly;
import java.io.*;
import java.util.Map;

public class Copy {
	private String copyId;
    private CopyStatus status;

    public Copy(String copyId, CopyStatus status) {
        this.copyId = copyId;
        this.status = status;
    }

    public String getCopyId() {
        return copyId;
    }

    public CopyStatus getStatus() {
        return status;
    }

    public void setStatus(CopyStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Copy ID: " + copyId + " | Status: " + status;
    }
}
