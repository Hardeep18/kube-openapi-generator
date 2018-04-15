# coding: utf-8

"""
    stash-server

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_api_group import IoK8sApimachineryPkgApisMetaV1APIGroup  # noqa: F401,E501


class IoK8sApimachineryPkgApisMetaV1APIGroupList(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'api_version': 'str',
        'groups': 'list[IoK8sApimachineryPkgApisMetaV1APIGroup]',
        'kind': 'str'
    }

    attribute_map = {
        'api_version': 'apiVersion',
        'groups': 'groups',
        'kind': 'kind'
    }

    def __init__(self, api_version=None, groups=None, kind=None):  # noqa: E501
        """IoK8sApimachineryPkgApisMetaV1APIGroupList - a model defined in Swagger"""  # noqa: E501

        self._api_version = None
        self._groups = None
        self._kind = None
        self.discriminator = None

        if api_version is not None:
            self.api_version = api_version
        self.groups = groups
        if kind is not None:
            self.kind = kind

    @property
    def api_version(self):
        """Gets the api_version of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501

        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources  # noqa: E501

        :return: The api_version of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501
        :rtype: str
        """
        return self._api_version

    @api_version.setter
    def api_version(self, api_version):
        """Sets the api_version of this IoK8sApimachineryPkgApisMetaV1APIGroupList.

        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources  # noqa: E501

        :param api_version: The api_version of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501
        :type: str
        """

        self._api_version = api_version

    @property
    def groups(self):
        """Gets the groups of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501

        groups is a list of APIGroup.  # noqa: E501

        :return: The groups of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501
        :rtype: list[IoK8sApimachineryPkgApisMetaV1APIGroup]
        """
        return self._groups

    @groups.setter
    def groups(self, groups):
        """Sets the groups of this IoK8sApimachineryPkgApisMetaV1APIGroupList.

        groups is a list of APIGroup.  # noqa: E501

        :param groups: The groups of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501
        :type: list[IoK8sApimachineryPkgApisMetaV1APIGroup]
        """
        if groups is None:
            raise ValueError("Invalid value for `groups`, must not be `None`")  # noqa: E501

        self._groups = groups

    @property
    def kind(self):
        """Gets the kind of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501

        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds  # noqa: E501

        :return: The kind of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """Sets the kind of this IoK8sApimachineryPkgApisMetaV1APIGroupList.

        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds  # noqa: E501

        :param kind: The kind of this IoK8sApimachineryPkgApisMetaV1APIGroupList.  # noqa: E501
        :type: str
        """

        self._kind = kind

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, IoK8sApimachineryPkgApisMetaV1APIGroupList):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
