# coding: utf-8

"""
    stash-server

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class RepositoriesStashAppscodeComApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_repositories_stash_appscode_com_api_group(self, **kwargs):  # noqa: E501
        """get_repositories_stash_appscode_com_api_group  # noqa: E501

        get information of a group  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.get_repositories_stash_appscode_com_api_group(async=True)
        >>> result = thread.get()

        :param async bool
        :return: IoK8sApimachineryPkgApisMetaV1APIGroup
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.get_repositories_stash_appscode_com_api_group_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_repositories_stash_appscode_com_api_group_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_repositories_stash_appscode_com_api_group_with_http_info(self, **kwargs):  # noqa: E501
        """get_repositories_stash_appscode_com_api_group  # noqa: E501

        get information of a group  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.get_repositories_stash_appscode_com_api_group_with_http_info(async=True)
        >>> result = thread.get()

        :param async bool
        :return: IoK8sApimachineryPkgApisMetaV1APIGroup
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_repositories_stash_appscode_com_api_group" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/yaml', 'application/vnd.kubernetes.protobuf'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/yaml', 'application/vnd.kubernetes.protobuf'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/apis/repositories.stash.appscode.com/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='IoK8sApimachineryPkgApisMetaV1APIGroup',  # noqa: E501
            auth_settings=auth_settings,
            async=params.get('async'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
