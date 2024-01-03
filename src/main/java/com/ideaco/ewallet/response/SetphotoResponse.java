package com.ideaco.ewallet.response;

import com.ideaco.ewallet.dto.SetphotoDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SetphotoResponse extends BaseResponse{
    private SetphotoDTO data;
}
