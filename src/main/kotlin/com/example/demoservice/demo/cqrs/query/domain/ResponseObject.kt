package com.example.demoservice.demo.cqrs.query.domain

import java.util.*
import kotlin.collections.ArrayList

class ResponseObject(_status:String, _message:String, _data: Optional<Student>) {
    var status:String?=""
    var message:String?=""
    var data:Optional<Student>?=null

    init {
        status = _status
        message = _message
        data = _data
    }
}